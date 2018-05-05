package com.base.thread.tradition;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableAndFuture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService threadpool = Executors.newFixedThreadPool(3);
	    CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadpool);
	    
	    for(int i=0;i<10;i++){
	    	final int seq = i;
		    completionService.submit(new Callable<Integer>() {		
				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					Thread.sleep(new Random().nextInt(5000));					
					return seq;
				}
			});
	    }
	    
	    for(int i=0;i<10;i++){
	    	try {
				System.out.println(completionService.take().get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	    }
	    //completionService.
	}

}

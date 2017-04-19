package com.thread.tradition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ExecutorService threadpool = Executors.newFixedThreadPool(3);
        ExecutorService threadpool = Executors.newCachedThreadPool();
        //ExecutorService threadpool = Executors.newSingleThreadExecutor();
	    for(int i=1;i<=10;i++){
	    	final int task = i;
	    	threadpool.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int j=0;j<10;j++){
						System.out.println(Thread.currentThread().getName()+" the loop of: "+j+" "+task);
					}
				}
			});
	    }
	    threadpool.shutdown();
	}

}

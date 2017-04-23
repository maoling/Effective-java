package com.base.thread.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestFuturn {

	static class Job<Object> implements Callable<Object>{
		@Override
		public Object call() throws Exception {
			// TODO Auto-generated method stub
			return loadData();
		}

		private Object loadData() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(20*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return (Object) "fuck you";
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
        FutureTask future = new FutureTask(new Job<Object>());
        new Thread(future).start();
        //do  something else
        try {
        	
			Thread.sleep(10*1000);
			System.out.println("do something else");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Object result = (Object)future.get();
        System.out.println(result);
	}

	

}

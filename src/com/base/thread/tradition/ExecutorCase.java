package com.base.thread.tradition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorCase {

	private static ExecutorService executors = Executors.newFixedThreadPool(10);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < 20; i++) {
			 executors.submit(new Task());
		 }
	}
	
	static class Task implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}

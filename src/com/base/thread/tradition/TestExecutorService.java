package com.base.thread.tradition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
    
	static class Job implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			doWork();
		}

		private void doWork() {
			// TODO Auto-generated method stub
			System.out.println("doing!......");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0;i<10;i++){
			exec.execute(new Job());
		}						
	}

}

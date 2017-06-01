package com.base.thread.tradition;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BitOperationDemo {
	
	public static int i = 0;
	
    public static void calculate() {       
          i++;
    }
	
	public void logRequest() {      
		long zxid = 0L;
        System.out.println( zxid & 0xffffffffL);   
    }
	
    public static void main(String[] args) throws InterruptedException {
    	 
		//while (true) {
			final int count = 10;
			ExecutorService exec = Executors.newFixedThreadPool(5);			
			final CountDownLatch countDownLatch = new CountDownLatch(count);  
			for(int j = 0;j<count;j++) {  				
				exec.submit(new Runnable() {
					public void run() {	
						System.out.println(Thread.currentThread().getName() + "has been submitted!");
						calculate();
						countDownLatch.countDown();
					}
				});					
			}
			countDownLatch.await();
			System.out.println("i:" + i);		
	    	
	    	exec.shutdown();
	    	//i = 0;
		//}
    	
    	
	}
}

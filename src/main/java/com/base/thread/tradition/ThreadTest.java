package com.base.thread.tradition;

import java.util.concurrent.TimeUnit;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Thread(
        	new Runnable() {			
				@Override
				public void run() {
					while(true){
	        			try {
							TimeUnit.MILLISECONDS.sleep(500);
							System.out.println("Runnable()");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        		}
					
				}
			}     		        		       		
        	){
        	
        	public void run() {
        		while(true){
        			try {
						TimeUnit.MILLISECONDS.sleep(500);
						System.out.println("Thread");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		}
        	};
        	
        }.start();
        
	}

}

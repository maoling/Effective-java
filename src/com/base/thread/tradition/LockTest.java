package com.base.thread.tradition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.sun.istack.internal.logging.Logger;

public class LockTest {
	
	public static void main(String[] args) {
		new LockTest().init();
	}

	private void init() {
		final Outputer output = new Outputer();
		
        new Thread(new Runnable() {		
			@Override
			public void run() {
				
				while(true){
        			try {
						TimeUnit.MILLISECONDS.sleep(500);					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			output.output("lihuoming");
        		}	
				
			}
		}).start();
        
        new Thread(new Runnable() {		
			@Override
			public void run() {
				
				while(true){
        			try {
						TimeUnit.MILLISECONDS.sleep(500);					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			output.output("zhangxiaoxiang");
				}
        	}	
				
		}).start();
	}
	
	
	static class Outputer{
		//Lock lock = new ReentrantLock();
		private void output(String name){
		    //lock.lock();
			try{
				for(char c:name.toCharArray()){	Lock lock = new ReentrantLock();
					System.out.print(c);
				}
				System.out.println();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				//lock.unlock();
			}			
		}
		
		private synchronized void output2(String name){
			
			for(char c:name.toCharArray()){
				//logger.
				//System.out.print(c);
			}
			System.out.println();
		}
		
		private static synchronized void output3(String name){
			
			for(char c:name.toCharArray()){
				//logger.
				//System.out.print(c);
			}
			System.out.println();
		}
	}

}

package com.base.thread.tradition;

import java.util.concurrent.TimeUnit;

import com.sun.istack.internal.logging.Logger;



public class TraditionThreadSynchronized {
    private static Logger logger = Logger.getLogger(TraditionThreadSynchronized.class);
	
	public static void main(String[] args) {
		new TraditionThreadSynchronized().init();
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
		private void output(String name){
			synchronized (Outputer.class) {
				for(char c:name.toCharArray()){
					//logger.
					//System.out.print(c);
				}
				System.out.println();
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

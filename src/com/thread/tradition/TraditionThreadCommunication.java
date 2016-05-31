package com.thread.tradition;

import java.util.concurrent.TimeUnit;

public class TraditionThreadCommunication {

	//¾­µä
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Business b = new Business();
		
		 new Thread(new Runnable(){		
			@Override
			public void run() {				
    			for(int i=0;i<50;i++){
    				b.sub(i);
    			}	
        	}						
		 }).start();
		 
	 	for(int i=0;i<50;i++){
	 		b.main(i);
		}
	}
	
	//¸ßÀà¾Û
	static class Business{
		private boolean isSub = true;
		private synchronized void sub(int i){
			while(!isSub){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			for(int j=0;j<10;j++){
				System.out.println("sub thread:"+j+"---loop:"+i);
			}
			isSub = false;
			this.notify();
		}
		
		private synchronized void main(int i){
			
			while(isSub){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int j=0;j<100;j++){
				System.out.println("Main thread:"+j+"---loop:"+i);
			}
			isSub = true;
			this.notify();
		}			
	}

}

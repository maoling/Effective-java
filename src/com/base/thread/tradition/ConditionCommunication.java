package com.base.thread.tradition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionCommunication {

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
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        
		private boolean isSub = true;
		private void sub(int i){
			lock.lock();
			try {
				while(!isSub){
					try {
						condition.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				for(int j=0;j<10;j++){
					System.out.println("sub thread:"+j+"---loop:"+i);
				}
				isSub = false;
				condition.signal();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
		
		private void main(int i){
			lock.lock();
			try {
				while(isSub){
					try {
						condition.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(int j=0;j<100;j++){
					System.out.println("Main thread:"+j+"---loop:"+i);
				}
				isSub = true;
				condition.signal();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}			
	}

}

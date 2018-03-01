package com.base.thread.tradition;

public class SyncThread implements Runnable {
	private static int count;

	public SyncThread() {
		count = 0;
	}
	
	public static synchronized void method() {
	         for (int i = 0; i < 5; i++) {
	            try {
	               System.out.println(Thread.currentThread().getName() + ":   " + (count++));
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	      
	   }
	
	@Override
	public void run() {
		method();
    }

	   public int getCount() {
	      return count;
	   }
	
	public static void main(String[] args) {
		/*SyncThread syncThread = new SyncThread();
		Thread thread1 = new Thread(syncThread, "SyncThread1");
		Thread thread2 = new Thread(syncThread, "SyncThread2");
		thread1.start();
		thread2.start();*/
		
		Thread thread1 = new Thread(new SyncThread(), "SyncThread1");
		Thread thread2 = new Thread(new SyncThread(), "SyncThread2");
		thread1.start();
		thread2.start();

	}

}

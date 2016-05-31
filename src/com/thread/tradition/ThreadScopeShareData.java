package com.thread.tradition;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ThreadScopeShareData {

	private int data = 0;
	final static Map<Thread,Integer> threadlocal = new HashMap<Thread,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=0;i<2;i++){
			new Thread(new Runnable() {		
				@Override
				public void run() {
					int data = new Random().nextInt(10);
					threadlocal.put(Thread.currentThread(), data);
					System.out.println(Thread.currentThread().getName()+" has put data:"+data);
					new A().getData();
					new B().getData();
		    	}	
					
			}).start();
		 }
	 
	}
	
	static class A{
		private void getData(){
			System.out.println("A from: "+Thread.currentThread().getName()+" get data: "+threadlocal.get(Thread.currentThread()));
		}
	}
	
	static class B{
		private void getData(){
			System.out.println("B from: "+Thread.currentThread().getName()+" get data: "+threadlocal.get(Thread.currentThread()));
		}
	}

}

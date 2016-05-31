package com.thread.tradition;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import sun.nio.cs.ext.ISCII91;

public class ThreadLocalTest {

	private int data = 0;
	final static ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=0;i<2;i++){
			new Thread(new Runnable() {		
				@Override
				public void run() {
					int data = new Random().nextInt(10);
					//threadlocal.set(data);
					MyThreadScopeData.getInstance().setAge(data);
					
					System.out.println(Thread.currentThread().getName()+" has put data:"+data);
					new A().getData();
					new B().getData();
		    	}	
					
			}).start();
		 }
	 
	}
	
	static class A{
		private void getData(){
			//System.out.println("A from: "+Thread.currentThread().getName()+" get data: "+threadlocal.get());
			System.out.println("A from: "+Thread.currentThread().getName()+" get data: "+ MyThreadScopeData.getInstance().getAge());
			
		}
	}
	
	static class B{
		private void getData(){
			//System.out.println("B from: "+Thread.currentThread().getName()+" get data: "+threadlocal.get());
			System.out.println("B from: "+Thread.currentThread().getName()+" get data: "+ MyThreadScopeData.getInstance().getAge());
		}
	}
	
	static class MyThreadScopeData{
		//private MyThreadScopeData instance = null;
		private static ThreadLocal<MyThreadScopeData> map = new ThreadLocal<MyThreadScopeData>();
		private MyThreadScopeData(){}
		
		private static MyThreadScopeData getInstance(){
			
			MyThreadScopeData instance = map.get();
			if(instance == null){
				instance = new MyThreadScopeData();
				map.set(instance);
			}
			return instance;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		private int age;
		
	}

}

package com.base.thread.tradition;

public class VolatileDemo {

	private volatile int number = 0;
	
	public int getNumber() {
		return this.number;
	}
	
	public void increase() {
		this.number++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolatileDemo vd = new VolatileDemo();
		for (int i=0;i<500;i++) {
			new Thread(new Runnable() {			
				@Override
				public void run() {
					// TODO Auto-generated method stub
					vd.increase();
				}
			}).start();
		}
		while(Thread.activeCount() > 1) {
			Thread.yield();
		}
		
		System.out.println(vd.getNumber());
	}

}

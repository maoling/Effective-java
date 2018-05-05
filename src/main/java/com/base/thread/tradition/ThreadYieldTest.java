package com.base.thread.tradition;

/*
 * http://blog.csdn.net/jjwwmlp456/article/details/38620439
 * http://www.importnew.com/14958.html
 * */
public class ThreadYieldTest implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			// 暂停当前正在执行的线程对象，并执行其他线程，就是进入就绪状态
			Thread.currentThread().yield();
			// 可能还会执行 本线程，
		}
	}

	public static void main(String[] args) {
		ThreadYieldTest runn = new ThreadYieldTest();
		Thread t1 = new Thread(runn);
		Thread t2 = new Thread(runn);
		Thread t3 = new Thread(runn);

		t2.setPriority(t2.getPriority() + 1);
		t1.start();
		t2.start();
		t3.start();

	}
}
package com.base.thread.tradition;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * 可以看到，主线程等待所有3个线程都执行结束后才开始执行。
 * @author maoling
 *
 */
public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {
		int totalThread = 3;
		long start = System.currentTimeMillis();
		CountDownLatch countDown = new CountDownLatch(totalThread);

		for (int i = 0; i < totalThread; i++) {
			final String threadName = "Thread " + i;
			new Thread(() -> {
				System.out.println(String.format("%s\t%s %s", new Date(), threadName, "started"));
				try {
					Thread.sleep(10);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				countDown.countDown();
				System.out.println(String.format("%s\t%s %s", new Date(), threadName, "ended"));
			}).start();
			;
		}
		// 用countDown()方法时将计数器减1，而await()会等待计数器变为0
		countDown.await();
		long stop = System.currentTimeMillis();
		System.out.println(String.format("Main Thread : Total time : %sms", (stop - start)));
	}
}
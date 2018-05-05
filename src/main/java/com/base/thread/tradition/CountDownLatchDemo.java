package com.base.thread.tradition;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * ���Կ��������̵߳ȴ�����3���̶߳�ִ�н�����ſ�ʼִ�С�
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
		// ��countDown()����ʱ����������1����await()��ȴ���������Ϊ0
		countDown.await();
		long stop = System.currentTimeMillis();
		System.out.println(String.format("Main Thread : Total time : %sms", (stop - start)));
	}
}
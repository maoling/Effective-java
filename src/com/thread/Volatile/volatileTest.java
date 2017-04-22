package com.thread.Volatile;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* http://www.importnew.com/18126.html
 http://www.importnew.com/17820.html
 http://blog.jobbole.com/98028/
 */
public class volatileTest {

	public int inc = 0;
	Lock lock = new ReentrantLock();

	/*public void increase() {
		lock.lock();
		try {
			inc++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}*/

	/**/
	public synchronized void  increase() { inc++; }
	 

	/*
	 * public volatile AtomicInteger inc = new AtomicInteger();
	 * 
	 * public void increase() { inc.addAndGet(1); }
	 */

	public static void main(String[] args) {
		final volatileTest test = new volatileTest();
		for (int i = 0; i < 10; i++) {
			new Thread() {
				@Override
				public void run() {
					for (int j = 0; j < 1000; j++)
						test.increase();
				};
			}.start();
		}

		while (Thread.activeCount() > 1)
			// 保证前面的线程都执行完
			Thread.yield();
		System.out.println(test.inc);
	}
}
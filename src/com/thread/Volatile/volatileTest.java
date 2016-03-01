package com.thread.Volatile;

/* http://www.importnew.com/18126.html
 http://www.importnew.com/17820.html
 http://blog.jobbole.com/98028/
 */
public class volatileTest {

	public volatile int inc = 0;

	public void increase() {
		inc++;
	}

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
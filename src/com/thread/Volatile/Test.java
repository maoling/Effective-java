package com.thread.Volatile;

public class Test {
	public volatile int inc = 0;

	public void increase() {
		inc++;
	}

	public static void main(String[] args) {
		final Test test = new Test();
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
			// ��֤ǰ����̶߳�ִ����
			Thread.yield();
		System.out.println(test.inc);
	}
}
package com.base.thread.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * https://www.zhihu.com/question/25575949/answer/31238944
 * */
public class Concurrentcomputation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final int a = 10;
		long pre = System.currentTimeMillis();
		int N = 1000;// (int) Long.MAX_VALUE;
		int rsValue = parallelMultiplication(a, 34, N) / N;
		System.out.println(rsValue);
		// System.out.println(a * 34);
		// threadAdd(a);
		System.out.println("����һ������ʱ�䣺" + (System.currentTimeMillis() - pre)
				+ "����");
	}

	public static void threadAdd(final int a) {
		// ��ʹ��Java�ֲ��ڲ�����������ڲ���ʱ����������������ڷ����ľֲ���������þֲ���������ʹ��final�ؼ��������Σ����򽫻���ֱ������Cannot
		// refer to a non-final variable * inside an inner class defined in a
		// different method��
		final AtomicInteger atomicInteger = new AtomicInteger(0);
		Thread[] threads = new Thread[34];
		for (int i = 0; i < threads.length; ++i) {

			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					// System.out.println("this represents:" + this.getClass());
					atomicInteger.addAndGet(a);
				}
			});
			threads[i].start();
		}

		for (int i = 0; i < threads.length; ++i) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(atomicInteger.get());
	}

	private static int parallelMultiplication(final int o1, final int o2, int N)
			throws Exception {
		final AtomicInteger rsValue = new AtomicInteger(0);
		Thread[] threads = new Thread[N];
		for (int i = 0; i < threads.length; ++i) {
			threads[i] = new Thread(new Runnable() {

				@Override
				public void run() {
					rsValue.addAndGet(o1 * o2);
				}
			});
			threads[i].start();
		}
		for (int i = 0; i < threads.length; ++i) {
			threads[i].join();
		}
		return rsValue.get();
	}
}

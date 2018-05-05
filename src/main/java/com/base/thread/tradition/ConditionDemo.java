package com.base.thread.tradition;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {
	
    public static void main(String[] args) {
		
    	 Lock lock = new ReentrantLock();

         //����һ������
         Condition condition = lock.newCondition();

         CountDownLatch countDownLatch = new CountDownLatch(2);

         /**
          * �߳�A������20�������������ȴ��߳�B����
          */
         new Thread(() -> {
             try {
                 lock.lock();
                 for (int i = 0; i < 100; i++) {
                     System.out.println(Thread.currentThread().getName() + ":" + i);
                     if (i == 20) {
                         condition.await();
                         System.out.println(Thread.currentThread().getName()+"�����ѣ�");
                     }
                 }
             } catch (InterruptedException e) {
                 System.out.println(e.getMessage());
                 e.printStackTrace();
             } finally {
                 lock.unlock();
             }

             countDownLatch.countDown();

         }, "ThreadA").start();

         /**
          * �߳�B����2������߳�A
          */
         new Thread(() -> {
             try {
                 lock.lock();
                 TimeUnit.SECONDS.sleep(2);
                 System.out.println("�����߳�");
                 condition.signal();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             finally {
                 lock.unlock();
             }
             countDownLatch.countDown();

         },"ThreadB").start();

         try {
             countDownLatch.await();
             System.out.println("���������");
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    	
	}
}

package com.base.thread.tradition;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {
	
    public static void main(String[] args) {
		
    	 Lock lock = new ReentrantLock();

         //创建一个条件
         Condition condition = lock.newCondition();

         CountDownLatch countDownLatch = new CountDownLatch(2);

         /**
          * 线程A遍历到20后自我阻塞，等待线程B唤醒
          */
         new Thread(() -> {
             try {
                 lock.lock();
                 for (int i = 0; i < 100; i++) {
                     System.out.println(Thread.currentThread().getName() + ":" + i);
                     if (i == 20) {
                         condition.await();
                         System.out.println(Thread.currentThread().getName()+"被唤醒！");
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
          * 线程B休眠2秒后唤醒线程A
          */
         new Thread(() -> {
             try {
                 lock.lock();
                 TimeUnit.SECONDS.sleep(2);
                 System.out.println("唤醒线程");
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
             System.out.println("程序结束！");
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    	
	}
}

package com.base.thread.tradition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * http://www.jianshu.com/p/4358b1466ec9
 * @author maoling
 */

public class Queue<T> {
    private final T[] items;
    private final Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();
    private int head, tail, count;
    public Queue(int maxSize) {
        items = (T[]) new Object[maxSize];
    }
    public Queue() {
        this(10);
    }

    public void put(T t) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length) {
                //������ʱ���߳̽���ȴ����й����̱߳�����ʱ�������ﷵ�ء�
                notFull.await(); 
            }
            items[tail] = t;
            if (++tail == items.length) {
                tail = 0;
            }
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            T o = items[head];
            items[head] = null;//GC
            if (++head == items.length) {
                head = 0;
            }
            --count;
            notFull.signal();
            return o;
        } finally {
            lock.unlock();
        }
    }
}
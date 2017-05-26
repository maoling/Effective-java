package com.base.thread.tradition;

/**
 * http://blog.csdn.net/wthfeng/article/details/72510804
 * @author maoling
 *  公平锁与非公平锁

ReentrantLock 有一个很重要的概念就是锁的公平性。所谓公平锁，就是使线程按照请求锁的顺序依次获得锁，反之，就是非公平的。也就是说，如果锁是非公平的，有的线程可能一直不断获取锁，而有的线程可能一直获取不到。而公平锁则不会，它会按请求顺序依次分配。

那为什么要设计非公平锁呢？原因是效率问题。处于CPU调度考虑，采用公平锁会消耗一些性能保证线程调度公平和同步，而且对于重复获取锁的操作中，某个线程连续获取锁的概率是很高的，而公平锁则遏制了这一点。所以，如果线程的执行顺序对你的程序不重要的话，最好使用非公平锁。另外，synchronized内置锁也是非公平锁。

//默认为非公平锁
Lock lock = new ReentrantLock();
//通过构造函数创建公平锁      
Lock lock2 = new ReentrantLock(true);
可重入性
从名字就可以看出，ReentrantLock 是可重入锁。即一个线程获取该锁后可以在后续过程中多次获取该锁，以避免被自己锁死的情况。这个语义synchronized也支持。
 */

public class ReentrantLockDemo {
   
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

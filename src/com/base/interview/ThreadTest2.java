package com.base.interview;

/**
 * 
 * 
         在调用子类构造器之前，会先调用父类构造器，当子类构造器中没有使用"super(参数或无参数)"指定调用父类构造器时，是默认调用父类的无参构造器，如果父类中包含有参构造器，却没有无参构造器，则在子类构造器中一定要使用“super(参数)”指定调用父类的有参构造器，不然就会报错。
  
   thread.Join把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
   t.join();      //使调用线程 t 在此之前执行完毕。 
   t.join(1000);  //等待 t 线程，等待时间是1000毫秒
   @author maoling
 *
 */
public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException{
    	Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("2");
            }
        });
        t.start();
         
        t.join(1999);
        System.out.print("1");   	
	}
}

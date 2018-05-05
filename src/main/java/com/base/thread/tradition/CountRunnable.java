package com.base.thread.tradition;

/**
 * http://blog.csdn.net/zrh_lawliet/article/details/53544303
 * @author maoling
 *
 */
public class CountRunnable implements Runnable {
    Count count = null;
    public CountRunnable(Count count) {
        // TODO Auto-generated constructor stub
        this.count=count;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        count.add();
    }
    
    public static void main(String[] args) throws InterruptedException {
        
    	while (true) {
        	Count count = new Count();
            Thread a = new Thread(new CountRunnable(count));
            Thread b = new Thread(new CountRunnable(count));
            a.start();
            b.start();
            
            a.join();
            b.join();
            if (count.i != (1 << 10) )
            	System.out.println(count.i);
            Thread.sleep(200);
        }
    }
}

class Count {
    public int i = 1;
    //synchronized
    public void add() {
        for(int j = 0; j < 5; j++) {
            //i++;
        	i <<= 1;
        }
    }
}
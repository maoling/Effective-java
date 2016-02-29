package com.thread.tradition;
class MyRunnable implements Runnable{
    
    private int ticketsCount = 5;
    
    
    public void run() {
        while(ticketsCount > 0){
            ticketsCount--;
            System.out.println(Thread.currentThread().getName()+" ����һ��Ʊ����ʣ�£�"+ticketsCount);
        }
    }
}
public class TicketsTestRunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread th1 = new Thread(mr,"����1");
        Thread th2 = new Thread(mr,"����2");
        Thread th3 = new Thread(mr,"����3");
        
        th1.start();
        th2.start();
        th3.start();
    }
}
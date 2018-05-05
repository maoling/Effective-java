package com.base.interview;

/**
 * 
 * 
         �ڵ������๹����֮ǰ�����ȵ��ø��๹�����������๹������û��ʹ��"super(�������޲���)"ָ�����ø��๹����ʱ����Ĭ�ϵ��ø�����޲ι���������������а����вι�������ȴû���޲ι��������������๹������һ��Ҫʹ�á�super(����)��ָ�����ø�����вι���������Ȼ�ͻᱨ��
  
   thread.Join��ָ�����̼߳��뵽��ǰ�̣߳����Խ���������ִ�е��̺߳ϲ�Ϊ˳��ִ�е��̡߳��������߳�B�е������߳�A��Join()������ֱ���߳�Aִ����Ϻ󣬲Ż����ִ���߳�B��
   t.join();      //ʹ�����߳� t �ڴ�֮ǰִ����ϡ� 
   t.join(1000);  //�ȴ� t �̣߳��ȴ�ʱ����1000����
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

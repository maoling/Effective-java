package com.base.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadTest {
	/**
	 * https://www.nowcoder.com/questionTerminal/a804e21b00d4464faf4e9bbe3a7e2df4
	 * @param args
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {
    	
    	/*final Object obj = new Object();
        Thread t1 = new Thread() {
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();
                        System.out.println("Thread 1 wake up.");
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        t1.start();
        Thread.sleep(1000);//We assume thread 1 must start up within 1 sec.
        Thread t2 = new Thread() {
            public void run() {
                synchronized (obj) {
                    obj.notifyAll();
                    System.out.println("Thread 2 sent notify.");
                }
            }
        };
        t2.start();
        
        *//**
         * �ӿ�ֻ�ܱ�public��Ĭ�����η�����
         * Boolean���εı���Ϊ��װ���ͣ���ʼ��ֵΪfalse,���и�ֵʱ�����Boolean.valueOf(boolean b)�����Զ�����Ϊ�����������ͣ���˸�ֵ��flagֵΪtrue������ı�true�� ���ʹ��==�Ƚ�,������ı�false��if�����Ƚϣ���boolean����������Ͷ�����ʹ�ø�ֵ��䣬�������ʾ�޷�ת�ɲ���ֵ
         *//*
        Boolean flag = false;
        if (flag = true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }*/
    	
    	/*final StringBuilder sb = new StringBuilder();
    	sb.append("fuck");sb.append("you");
    	System.out.println(sb.toString());
    	//final int a = 8; a = 9;*/
    	Map<String,List<String>> map = new HashMap<>();
    	List<String> list = new ArrayList<>();
    	list.add("fuck");
    	map.put("maoling",list);
    	list = map.get("maoling");
    	list.add("you!");
    	System.out.println(list.toString());
    	/*for (int ) {
    		
    	}*/
    }
}

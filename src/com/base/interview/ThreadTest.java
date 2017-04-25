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
         * 接口只能被public和默认修饰符修饰
         * Boolean修饰的变量为包装类型，初始化值为false,进行赋值时会调用Boolean.valueOf(boolean b)方法自动拆箱为基本数据类型，因此赋值后flag值为true，输出文本true。 如果使用==比较,则输出文本false。if的语句比较，除boolean外的其他类型都不能使用赋值语句，否则会提示无法转成布尔值
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

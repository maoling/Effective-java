package com.test;
public class Test4_9{
    static int cnt = 6;
    static{
        cnt += 9;
    }
public static void main(String[] args){
	/*double d=Math.cos(Math.toRadians(60));
	System.out.println(d);*/
    System.out.println("cnt =" + cnt);
}
static{
	cnt +=3;
    };

static{
	cnt /=3;
    };
}
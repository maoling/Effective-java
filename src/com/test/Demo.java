package com.test;
import java.util.Scanner;
class A2{
	public int x=0;
	public A2(){
	}
}
public class Demo {
	public static void main(String[] args){
       A2 a=new A2();
       final A2 s=a;
       System.out.println(s.x);
       a.x++;
       System.out.println(s.x);
    }
}
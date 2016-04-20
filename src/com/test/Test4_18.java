package com.test;
public class Test4_18{
	static{
	   int x=5;
	}
	static int x,y;
	public static void main(String args[]){
	   x--;
	   myMethod( );
	   System.out.println(x+y+ ++x);
	}
	public static void myMethod(){
	   y=x++ + ++x;
	}
}
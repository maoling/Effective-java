package com.base.puzzle;

public class Client32 {

	static {
		i = 100;
	}
	//如果有多个静态块对i继续赋值；i最终还是等于1；谁的位置越靠后越有决定权
	public static int i = 1;
	
	public static void main(String[] args) {
          System.out.println(i);
	}	
}

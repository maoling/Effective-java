package com.base.interview;

public class Test2017_09_17 {	
	public static Test2017_09_17 t1 = new Test2017_09_17();	
	static {
		System.out.println("B");
	}
	{
		System.out.println("A");
	}
	public static void main(String[] args) {
		Test2017_09_17 t2 = new Test2017_09_17();
	}

}

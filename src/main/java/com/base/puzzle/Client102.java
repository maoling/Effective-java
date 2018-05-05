package com.base.puzzle;

import java.lang.reflect.Method;

public class Client102 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String methodName = "doStuff";
		//访问包括public,private方法等，而且不受于访问权限
		Method m1 = Foo.class.getDeclaredMethod(methodName);
		//访问所有public级别的方法
		Method m2 = Foo.class.getMethod(methodName);
	}
	
	static class Foo {
		void doStuff() {}
	}
}

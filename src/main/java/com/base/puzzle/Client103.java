package com.base.puzzle;

import java.lang.reflect.Method;


class Client103 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String methodName = "doStuff";
		//访问包括public,private方法等，而且不受于访问权限
		Method m1 = Foo.class.getMethod(methodName);
		//Accessible属性只是用来判断是否需要进行安全检查的，如果不需要则直接执行，这可大幅提高性能
		System.out.println("accessable:" + m1.isAccessible());
		m1.invoke(new Foo());
	}
}

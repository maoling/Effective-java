package com.base.puzzle;

import java.lang.reflect.Method;

public class Client102 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String methodName = "doStuff";
		//���ʰ���public,private�����ȣ����Ҳ����ڷ���Ȩ��
		Method m1 = Foo.class.getDeclaredMethod(methodName);
		//��������public����ķ���
		Method m2 = Foo.class.getMethod(methodName);
	}
	
	static class Foo {
		void doStuff() {}
	}
}

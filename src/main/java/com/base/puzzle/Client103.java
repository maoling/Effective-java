package com.base.puzzle;

import java.lang.reflect.Method;


class Client103 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String methodName = "doStuff";
		//���ʰ���public,private�����ȣ����Ҳ����ڷ���Ȩ��
		Method m1 = Foo.class.getMethod(methodName);
		//Accessible����ֻ�������ж��Ƿ���Ҫ���а�ȫ���ģ��������Ҫ��ֱ��ִ�У���ɴ���������
		System.out.println("accessable:" + m1.isAccessible());
		m1.invoke(new Foo());
	}
}

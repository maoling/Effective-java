package com.test;

public class A {
	public  void B(){
		
	}
	
	public static void C(){
		//���෽���п��Ե��ñ����ʵ������
		A a = new A();
		a.B();
	}
    public static void D(){
    	 C();
    	 E e = new E();
    	 e.F();
    	//Cannot use this in a static context
		//this.C;
	}
}

 class E {
	public static void F(){
		
	}
}
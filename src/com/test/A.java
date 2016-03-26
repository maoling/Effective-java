package com.test;

public class A {
	public  void B(){
		
	}
	
	public static void C(){
		//在类方法中可以调用本类的实例方法
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
package com.test;
public class SuperClass {
	private static void a() {
	}// 类方法

	public static void b() {
	}// 类方法

	public void c() {
	}// 实例方法
	
	private void d() {
	}// 实例方法
}

class SonClass extends SuperClass {
 public void e() {
}// 实例方法

public static void main(String args[]) {
	Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);
    System.out.print(n1 == n2);
    System.out.print(",");
    System.out.println(n1 != n2);
	
	/*SuperClass s = new SuperClass();
	SonClass son = new SonClass();
	son. a ();// B选项错误，超类私有的类方法，子类不可访问
	son.b() ;// 超类公有类方法，子类可以访问
	son.c();// 超类公有实例方法，子类可以访问
	son. d ();// A选项错误，超类私有实例方法，子类不可访问
	s. e ();// C选项错误，实例方法不可直接调用其他类的类方法
	s.c();// D选项正确，实例方法可直接调用本类的公有类方法
	s.b() ;// 实例方法可直接调用本类的公有实例方法
*/}
}
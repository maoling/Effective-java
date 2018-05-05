package com.base.puzzle;

public class Client6 {

	public static void main(String[] args) {
		Base base = new Sub();
		base.fun(10, 75);
		Sub sub = new Sub();
		//sub.fun(10, 75);
		System.out.println(base instanceof Base);
		System.out.println(sub instanceof Base);
		System.out.println(Math.round(10.5) + "------------" + Math.round(-10.5));
	}
}

class Base {
	void fun (int price, int... discount) {
		System.out.println("base-----");
	}
}

class Sub extends Base {
	@Override
    void fun (int price, int[] discount) {
		System.out.println("sub-----");
	}
}
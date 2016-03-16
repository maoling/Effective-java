package com.datastructure;
/*
 * https://www.zhihu.com/question/24304289/answer/38218810
 * */
public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Apple implements Fruit{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("³ÔÆ»¹û£¡");
	}
	
}

interface Fruit{
	public void eat();	
}
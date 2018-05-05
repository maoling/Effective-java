package com.base.designpattern;
/*
 * https://www.zhihu.com/question/24304289/answer/38218810
 * */
public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = Factory.getInstance("com.designpattern.Orange");
		fruit.eat();
	}
}

class Apple implements Fruit{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("³ÔÆ»¹û£¡");
	}
	
}
class Orange implements Fruit {
 public void eat() {
	 System.out.println("³ÔéÙ×Ó¡£");
 };
}

class Factory{
	public static Fruit getInstance(String className){
		Fruit fruit = null;
		try {
			 fruit = (Fruit) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*if(className.equals("apple")){		
			return new Apple();
		}
		if(className.equals("orange")){		
			return new Orange();
		}*/
		return fruit;
	}
	
}

interface Fruit{
	public void eat();	
}
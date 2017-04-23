package com.base.interview;
abstract class Animal{
	protected String name = "animal";
	public Animal(){
		System.out.println("I am Animal father");
	}
    void say(){
    	System.out.println("Animal say");
    }
}
public class Cat extends Animal{
	private String name = "cat";
    public Cat(){
        System.out.println("I am a cat");
    }
    public static void main(String[] args) {
    	Animal cat=new Cat();
    	System.out.println(cat.name);
    	cat.say();
    }
	
	void say() {
		// TODO Auto-generated method stub
		System.out.println("cat say!");
	}
}
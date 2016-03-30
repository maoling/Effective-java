package com.test;

import java.util.Map;

class B extends Object
{
	
	static
    {
        System.out.println("Load B");
    }
	{
		System.out.println("b");
	}
    public B()
    {
        System.out.println("Create B");
    }
}
class A extends B
{
	
    static
    {
        System.out.println("Load A");
    }
    {
		System.out.println("a");
	}
    public A()
    {
        System.out.println("Create A");
    }
}
 
public class Testclass
{
	public static class innerClass{
        public static void prin(){
            System.out.println("innerClass");
        }
    }
	
    public static void main(String[] args)
    {
        new A();
       // Map<K, V>
    }
}
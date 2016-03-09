package com.util;
import java.util.HashMap;
 
public class Apple4HashcodeEqual {
	private String color;
 
	public Apple4HashcodeEqual(String color) {
		this.color = color;
	}
 
	//@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if (!(obj instanceof Apple4HashcodeEqual))
			return false;	
		if (obj == this)
			return true;
		return this.color.equals(((Apple4HashcodeEqual) obj).color);
	}
	
	public int hashCode(){
		return this.color.hashCode();	
	}
 
	public static void main(String[] args) {
		Apple4HashcodeEqual a1 = new Apple4HashcodeEqual("green");
		Apple4HashcodeEqual a2 = new Apple4HashcodeEqual("red");
		Apple4HashcodeEqual a3 = new Apple4HashcodeEqual("green");
 
		//hashMap stores apple type and its quantity
		HashMap<Apple4HashcodeEqual, Integer> m = new HashMap<Apple4HashcodeEqual, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		m.put(a3, 30);
		
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));
		System.out.println(m);
		System.out.println(m.get(new Apple4HashcodeEqual("green")));
	}
}
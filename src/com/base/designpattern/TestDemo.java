package com.base.designpattern;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Person { // CTRL + K
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age) {
		this.name= name ;
		this.age= age ;
	}
	@Override
	public String toString() {
	    return"Person [name="+ name+ ", age="+ age+ "]";
	}

	
}
	
	public class TestDemo { 
		public static void main(String[] args) throws Exception {
			
		
			Class<?> cls = Class.forName("com.designpattern.Person") ; // 取得Class对象
			Constructor<?> cons = cls.getConstructor(String.class,int.class);
			
			Object obj = cons.newInstance("maoling",25);
		    System.out.println(obj);
			/*Constructor<?> cons [] = cls.getConstructors() ; // 取得全部构造
			for(int x = 0; x < cons.length; x++) {
				System.out.println(cons[x]);
			}*/
			/*Method met [] = cls.getMethods() ; // 取得全部方法
			for(int x = 0; x < met.length; x++) {
				System.out.println(met[x]);
			}*/
		}
	}
	
	




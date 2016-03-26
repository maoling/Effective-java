package com.test;
class Person {  
	 public static String name = "Jack";  
} 
/*class Super{   
   static String greeting(){   
      return "Good night";   
  }      
  String name(){   
     return "Richard";   
  }   
}     

class Sub extends Super{   
	static String greeting(){   
     return "Hello";   
  }   
   
  String name(){   
     return "Dick";   
  }   
}   */
   
public class Test_3_24{  
	public static void changeValue(int x) {  
		x = x *2;  
	} 
	//定义一个改变对象属性的方法  
	public static void changeName(Person p) {  
		p.name = "Rose";  
	} 
	
  public static void main(String[] args){ 
	  String STRING;
	/*//定义一个Person对象，person是这个对象的引用  
	  Person person = new Person();  
	  //先显示这个对象的name属性  
	  System.out.println(person.name);  
	  //调用changeName(Person p)方法  
	  changeName(person);  
	  //再显示这个对象的name属性，看是否发生了变化  
	  System.out.println(person.name); */
	  
	  /*int num = 5;  
	  System.out.println(num);  
	  changeValue(num);  
	  System.out.println(num); */ 
	/*Super s = new Sub();   
    System.out.println(s.greeting()+","+s.name()); */  
  }   

}  


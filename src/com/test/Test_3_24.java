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
		//sayHello();  //Cannot make a static reference to the non-static method sayHello() from the type Test_3_24
		x = x *2;  
	} 
	//����һ���ı�������Եķ���  
	public static void changeName(Person p) {  
		p.name = "Rose";  
	} 
	public void sayHello(){
		
	}
  public static void main(String[] args){ 
	  //String STRING;
	  short a = 128; byte b = (byte) a;
	  System.out.println(a+" "+b);
	/*//����һ��Person����person��������������  
	  Person person = new Person();  
	  //����ʾ��������name����  
	  System.out.println(person.name);  
	  //����changeName(Person p)����  
	  changeName(person);  
	  //����ʾ��������name���ԣ����Ƿ����˱仯  
	  System.out.println(person.name); */
	  
	  /*int num = 5;  
	  System.out.println(num);  
	  changeValue(num);  
	  System.out.println(num); */ 
	/*Super s = new Sub();   
    System.out.println(s.greeting()+","+s.name()); */  
  }   

}  


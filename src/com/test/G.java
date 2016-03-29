package com.test;
 interface G{
	 public String name =""; //only public, static & final are permitted
	 static String email = "";
	 //static  void say();  //only public & abstract are permitted
	 /*public G(){
		
	}*/
}

abstract class H{
	private String name;
	static String email ;
	public H(){
		
	}
	static void say(){
		
	}
}
class A1{
	 public String name =""; //only public, static & final are permitted
	 protected String email = "";
	 private String grade = "";
	 /*public G(){
		
	}*/
}
class I extends A1{
	 public String name = super.name; //only public, static & final are permitted
	 //protected String email = super.email;
	 //private String grade = "";
	 void run(){
		 //super.grade;
		 I i = new I();
		 System.out.println(i.email);
	 }
}


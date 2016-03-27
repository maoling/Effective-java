package com.test;
interface G{
	 public String name =""; //only public, static & final are permitted
	 static String email = "";
	 /*public G(){
		
	}*/
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

abstract class H{
	private String name;
	public H(){
		
	}
}
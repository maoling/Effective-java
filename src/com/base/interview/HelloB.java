package com.base.interview;
public class HelloB extends HelloA 
{
 //private static String name = say();
	 
 public HelloB()
 {
	 System.out.println("construct B");
 }
 public String say() {
	 return "B name";
 }
 {
     System.out.println("I¡¯m B no static class");
 }
 static
 {
     System.out.println("static B");
 }
 public static void main(String[] args)
 {
     new HelloB();
 }
}
class HelloA
{
	 //private static String name = say();
	 public HelloA()
	 {
		 System.out.println("construct A");
	 }
	 {
	     System.out.println("I¡¯m A no static class");
	 }
	 
	 public String say() {
		 return "A name";
	 }
	 
	 static
	 {
	     System.out.println("static A");
	 }
}
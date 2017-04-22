package com.test;

/**
 * 
 * @author maoling
父类静态成员变量的初始化
父类静态代码块初始化

子类静态代码块初始化

父类非静态代码块初始化
父类无参构造函数初始化完成

子类静态成员变量的初始化

子类非静态代码块初始化
子类构造函数初始化完成
 */
class MyFather {
   private static String s = print();
   static{
          System. out.println("父类静态代码块初始化" );
   }
   {
          System. out.println("父类非静态代码块初始化" );
   }
   
   public static String print() {
          System.out.println("父类静态成员变量的初始化");
          return "父类静态成员变量的初始化";
   }
   
   public MyFather() {
          System.out.println("父类无参构造函数初始化完成" );
          //show();
   }
   
   public void show() {
          System.out.println("父类show()方法" );
   }
}

class MySon extends MyFather {
   private static int i = 1;
   private String s = print();
	
   static{
          System.out.println("子类静态代码块初始化" );
   }
   {
          System.out.println("子类非静态代码块初始化" );
   }
   
   public static String print() {
       System.out.println("子类静态成员变量的初始化");
       return "子类静态成员变量的初始化";
   }
   
   public void show() {
          System. out.println("子类show()方法：i=" +i);
   }
   
   public MySon() {
          System. out.println("子类构造函数初始化完成" );
          //show();
   }
}

public class TestClassLoadSeq {
   public static void main(String[] args) {
          new MySon();
   }
}
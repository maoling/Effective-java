package com.base.interview;
import java.util.Date;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper; 
public class SuperTest extends Date{ 
    private static final long serialVersionUID = 1L;
    public void example(int m){}
    //public int example(int n){}
    private void test(){ 
    	/**
    	 * TestSuper和Date的getClass都没有重写，他们都是调用Object的getClass，而Object的getClass作用是返回的是运行时的类的名字。这个运行时的类就是当前类
    	 */
    	System.out.println(super.getClass().getName());
    	System.out.println(super.getClass().getSuperclass().getName()); 
    } 
      
    public static void main(String[]args){ 
       new SuperTest().test(); 
       String a = "fuck";String b = "fuck";String c = new String("fuck");
       System.out.println(a == b);
       System.out.println(a == c);
    } 
}
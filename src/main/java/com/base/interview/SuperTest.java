package com.base.interview;
import java.util.Date;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper; 
public class SuperTest extends Date{ 
    private static final long serialVersionUID = 1L;
    public void example(int m){}
    //public int example(int n){}
    private void test(){ 
    	/**
    	 * TestSuper��Date��getClass��û����д�����Ƕ��ǵ���Object��getClass����Object��getClass�����Ƿ��ص�������ʱ��������֡��������ʱ������ǵ�ǰ��
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
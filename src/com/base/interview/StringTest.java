 package com.base.interview;

import java.util.HashMap;
import java.util.Hashtable;

/* http://www.jb51.net/article/73243.htm
 * http://www.importnew.com/18215.html
 * http://www.importnew.com/18274.html
 * */
public class StringTest {
	
/**
 * http://www.importnew.com/18167.html
 * javap��ʲô���������˳�֮Ϊ ������������Բ鿴java������Ϊ�������ɵ��ֽ��롣ͨ���������ǿ��Զ���Դ������ֽ��룬�Ӷ��˽�ܶ�������ڲ��Ĺ�����
 *
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hashtable<Integer,String>  ht = new Hashtable<Integer,String>();
		ht.put(1, null);*/
		/*HashMap<Integer,String>  hm = new HashMap<Integer,String>();
		hm.put(null, "1");
		hm.put(2, "2");
		hm.put(null, "3");
		hm.put(null, "4");
		System.out.println(hm);*/
		//System.out.println(3*0.1 == 0.3);
		
		/*byte a = 127;
		byte b = 127;
		b = (byte) (a + b);  // error : cannot convert from int to byte
		System.out.println(b);
		b += a; // ok
		System.out.println(b);*/
		
		/*int m = 0;
		for(int i=0;i<100;i++){
			//m = m++;//  0
			m = ++m;  //  100
		}
		System.out.println(m);*/
		/*int i = 2;
		int j = 3;*/
		
		/*String str1 = "I";
        str1 += "love"+"java";        //1)
        //str1 = str1+"love"+"java";      //2)
*/		
		//String str = new String("abc");
		
		/*String a = "hello";
        String b =  new String("hello");
        String c =  new String("hello");
        String d = b.intern();
 
        System.out.println(a==b);//f
        System.out.println(b==c);//f
        System.out.println(b==d);//f
        System.out.println(a==d);//true ???
*/        
		/*String a = "hello2";
		
		//String b = "hello";
		final String b = "hello";
		String c = b + "2";
		//String b = "hello" + 2;
		System.out.println((a == c));*/
		
		/*String a = "ABCabc";
		System.out.println("a = " + a);
		a.replace('A', 'a');
		// a = a.replace('A', 'a');
		System.out.println("a = " + a);*/

		/*
		 * String s = "ABCabc"; 
		 * System.out.println("s = " + s); 
		 * s = "123456";
		 * System.out.println("s = " + s);
		 */
		/*
		 * String string = "abc"; string = string + "efg";
		 * System.out.println(string);
		 */		 
		
		/* String a = "abcd"; String b = "abcd"; 
		 System.out.println("a == b : " + (a == b)); // true 
		 System.out.println("a.equals(b) : " + (a.equals(b))); // true
*/		 		
		
		   String c = new String("abcd").intern(); 
		   String d = new String("abcd").intern(); 
		   System.out.println("c == d : " + (c == d));// true 
		   System.out.println("c.equals(d) : " + (c.equals(d))); // true
		   //��JDK1.7 and 1.8��
		
	}
}

package com.util;
/**
 * http://www.importnew.com/18167.html
 * javap��ʲô���������˳�֮Ϊ ������������Բ鿴java������Ϊ�������ɵ��ֽ��롣ͨ���������ǿ��Զ���Դ������ֽ��룬�Ӷ��˽�ܶ�������ڲ��Ĺ�����
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0;
		for(int i=0;i<100;i++){
			//m = m++;//  0
			m = ++m;  //  100
		}
		System.out.println(m);
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
 
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(a==d);*/
        
		/*String a = "hello2";
		
		String b = "hello";
		//final String b = "hello";
		String c = b + 2;
		//String b = "hello" + 2;
		System.out.println((a == c));*/
	}

}

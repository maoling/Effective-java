package com.base.jvmtunning;
import java.util.ArrayList;  
import java.util.List;  
  
  
/** 
 * java����⣺д����ʵ��һ��StackOverFlowError��OutOfMemoryError  
 */  
public class OOMCase {  
  
    public static void main(String[] args) {  
    	String str = "";
        //System.out.println(str != "");
        /*String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str2 == str3);
        String str4 = str2.intern();
        System.out.println(str3 == str4);*/
        OOMCase test = new OOMCase();  
        //test.testStatckOverFlowError();  
        test.testOutOfMemoryError(); 
        
    }  
    //�׳�StackOverFlowError  
    private void testStatckOverFlowError(){  
        while(true){  
            testStatckOverFlowError();  //�ݹ�  
        }  
    }  
      
    //�׳�OutOfMemoryError  
    private void testOutOfMemoryError(){  
        List<int[]> list = new ArrayList<int[]>();  
        int size = 1;
        int[] arr = null;
        while (true) {  
            arr = new int[size];   //666 ûë��....����  
            size ++ ;
            list.add(arr);  
            try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }  
          
    }  
      
}  
package com.base.interview;
public class Test{
    private static int i=1;
    public int getNext(){
         return i++;
    }
    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext()+"---"+i);
        
        int i=42;
        double d=42.0000;
        long l=42;
        float f=42.0f;
        float f2=42.00f;
        System.out.println(d==i);
        System.out.println(f==i);
        System.out.println(f==f2);
        System.out.println(l==i);
        System.out.println(d==f);
    }
}
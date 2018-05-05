package com.base.interview;
public class Test2
{
    public static void add(Byte b)
    {
        b = b++;
    }
    public static void main(String[] args) {
    	Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
        
        int x = 10 ;
        double y = 20.2 ;
        long z = 10L;
        System.out.println(y * z);
        System.out.println(x + y * z);
        String str = "" + x + y * z ;
        System.out.println(str) ;
	}
    
}
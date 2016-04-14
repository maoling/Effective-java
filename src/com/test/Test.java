package com.test;
public class Test
{
    public static void main(String[] args)
    {
    	int k = f_test();
        System.out.println(k);
    	
    	/*int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2))
            {
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x +" "+y +" "+k);*/
    }
    
    public static int f_test(){
        int a = 0;
        try{
            a = 1;
            return a;
        }
        finally{
            System.out.println("It is in final chunk.");
            a = 2;
            return a;
        }
    }
}
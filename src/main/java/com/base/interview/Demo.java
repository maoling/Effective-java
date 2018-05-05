package com.base.interview;
public class Demo{
	


	public static int test(int b){
		try
		{
			b += 10;
			return b;
		}
		catch(RuntimeException e)
		{
		}
		catch(Exception e2)
		{
		}
		finally{
			b += 10;
			return b;
		}
		
	}
	
	public static void main(String args[]){
		String str = "hello world";
		str +=" a";
		
		int num = 10;
		 num >>= 1 ;
		System.out.println(test(num));
	}
}
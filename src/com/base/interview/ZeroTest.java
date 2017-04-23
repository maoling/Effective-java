package com.base.interview;
public class ZeroTest {
    public static int kankan(){
      int i = 0;
	  try{
		  i ++ ;
          return i;
	  }catch(Exception e){
		  throw new RuntimeException();
	  }finally{
		  i++;
	      return i;
	  }   	     
        
    }
	
    public static void main(String[] args) {
    	System.out.println(kankan());
	     /*try{
	       int i = 100 / 0;
	       System.out.print(i);
		  }catch(Exception e){
		       System.out.print(1);
		       throw new RuntimeException();
		  }finally{
		       System.out.print(2);
		  }
	     
	      System.out.print(3);*/
   }
 }
package com.test;
public class Example {
    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };
 
    public static void main(String args[]) {
    	/*Integer i01=59;
    	int i02=59;
    	Integer i03=Integer.valueOf(59);
    	Integer i04=new Integer(59);
    	System.out.println(i02==i04);*/
       /* Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);*/
    	System.out.println(returnTestInt());
    	/*Boolean flag = false;
    	if (flag = true)
    	{
    	    System.out.println("true");
    	}
    	else
    	{
    	    System.out.println("false");
    	}*/
    }
    public static int returnTestInt(){ 
    	int a = 0;  
    	try { 
    		return a++;  
    	 } catch (Exception e) {

        } finally { 
    	return ++a; 
       }
    }
    public static boolean returnTest()
    {
        try
        {
            return true;
        }
        catch (Exception e)
        {
     
        }
        finally
        {
            return false;
        }
    }
   public void change(String str, char ch[])      
   {
        str = "test ok";
        ch[0] = 'g';
    }
}
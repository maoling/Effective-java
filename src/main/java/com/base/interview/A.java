package com.base.interview;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * a是类中的成员变量，存放在堆区
   b、c都是方法中的局部变量，存放在栈区
   CyclicBarrier让一组线程等待其他线程；CountDownLatch让一组线程等待某个事件发生。
   Callable能够抛出checked exception。
        自动转换按从低到高的顺序转换。不同类型数据间的优先关系如下： 
        低 ---------------------------------------------> 高 
    byte,short,char-> int -> long -> float -> double
 * @author maoling
 *
 */
class A2 {
    private String a = "aa";
    public boolean methodB() {
        String b = "bb";
        final String c = "cc";
        return false;
    }
    
    /**
     * 题目说抛出一个异常，但是没说具体是什么异常，那么就要分情况了：
	   1.如果抛出一个FileNotFoundException(或其子类)，那么最终结果就打印FileNotFoundException
	   2.如果抛出一个IOException,或者IOException的子类(不包含FileNotFoundException及其子类)，那么最终结果就打印IOException
	   3.如果抛出一个Exception(不包含IOException及其子类),那么最终结果就打印Exception.
		以上，所以3个皆有可能.但是，不管是哪一种情况，只会输出其中之一
     */
    /*public void getCustomerInfo() {
        try {
            // do something that may cause an Exception
        } catch (FileNotFoundException ex) {
            System.out.print("FileNotFoundException!");
        } catch (IOException ex) {
            System.out.print("IOException!");
        } catch (Exception ex) {
            System.out.print("Exception!");
        }
    }*/
}

abstract class A3 {
	//注意protected的这种写法
	public A3 () {
		
	}
	protected abstract void f1();
	public final void f2() {}
	static final void fq(){}
	private void f3() {}
}
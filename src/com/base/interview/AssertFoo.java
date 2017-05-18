package com.base.interview;

/**
 * http://blog.csdn.net/tounaobun/article/details/8468401
 * http://lavasoft.blog.51cto.com/62575/43735/
 * vm参数：-ea
 * @author maoling
 *
 */
public class AssertFoo {
	
	private static int charAt(String s, int d) {
	    assert d >= 0 && d <= s.length();
	    if (d == s.length()) return -1;
	    return s.charAt(d);
	}
	
    public static void main(String args[]) {
        //断言1结果为true，则继续往下执行
        assert true;
        System.out.println("断言1没有问题，Go！");
 
        System.out.println("\n-----------------\n");
 
        //断言2结果为false,程序终止
        //assert false : "断言失败，此表达式的信息将会在抛出异常的时候输出！";
        System.out.println("断言2没有问题，Go！");
        charAt("",-1);
        
    }
}
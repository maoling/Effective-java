package com.base.interview;

/**
 * http://blog.csdn.net/tounaobun/article/details/8468401
 * http://lavasoft.blog.51cto.com/62575/43735/
 * vm������-ea
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
        //����1���Ϊtrue�����������ִ��
        assert true;
        System.out.println("����1û�����⣬Go��");
 
        System.out.println("\n-----------------\n");
 
        //����2���Ϊfalse,������ֹ
        //assert false : "����ʧ�ܣ��˱��ʽ����Ϣ�������׳��쳣��ʱ�������";
        System.out.println("����2û�����⣬Go��");
        charAt("",-1);
        
    }
}
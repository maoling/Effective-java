package com.base.interview;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * a�����еĳ�Ա����������ڶ���
   b��c���Ƿ����еľֲ������������ջ��
   CyclicBarrier��һ���̵߳ȴ������̣߳�CountDownLatch��һ���̵߳ȴ�ĳ���¼�������
   Callable�ܹ��׳�checked exception��
        �Զ�ת�����ӵ͵��ߵ�˳��ת������ͬ�������ݼ�����ȹ�ϵ���£� 
        �� ---------------------------------------------> �� 
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
     * ��Ŀ˵�׳�һ���쳣������û˵������ʲô�쳣����ô��Ҫ������ˣ�
	   1.����׳�һ��FileNotFoundException(��������)����ô���ս���ʹ�ӡFileNotFoundException
	   2.����׳�һ��IOException,����IOException������(������FileNotFoundException��������)����ô���ս���ʹ�ӡIOException
	   3.����׳�һ��Exception(������IOException��������),��ô���ս���ʹ�ӡException.
		���ϣ�����3�����п���.���ǣ���������һ�������ֻ���������֮һ
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
	//ע��protected������д��
	public A3 () {
		
	}
	protected abstract void f1();
	public final void f2() {}
	static final void fq(){}
	private void f3() {}
}
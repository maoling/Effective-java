package com.base.thread.tradition;

/**
 * http://blog.csdn.net/wthfeng/article/details/72510804
 * @author maoling
 *  ��ƽ����ǹ�ƽ��

ReentrantLock ��һ������Ҫ�ĸ���������Ĺ�ƽ�ԡ���ν��ƽ��������ʹ�̰߳�����������˳�����λ��������֮�����Ƿǹ�ƽ�ġ�Ҳ����˵��������Ƿǹ�ƽ�ģ��е��߳̿���һֱ���ϻ�ȡ�������е��߳̿���һֱ��ȡ����������ƽ���򲻻ᣬ���ᰴ����˳�����η��䡣

��ΪʲôҪ��Ʒǹ�ƽ���أ�ԭ����Ч�����⡣����CPU���ȿ��ǣ����ù�ƽ��������һЩ���ܱ�֤�̵߳��ȹ�ƽ��ͬ�������Ҷ����ظ���ȡ���Ĳ����У�ĳ���߳�������ȡ���ĸ����Ǻܸߵģ�����ƽ�����������һ�㡣���ԣ�����̵߳�ִ��˳�����ĳ�����Ҫ�Ļ������ʹ�÷ǹ�ƽ�������⣬synchronized������Ҳ�Ƿǹ�ƽ����

//Ĭ��Ϊ�ǹ�ƽ��
Lock lock = new ReentrantLock();
//ͨ�����캯��������ƽ��      
Lock lock2 = new ReentrantLock(true);
��������
�����־Ϳ��Կ�����ReentrantLock �ǿ�����������һ���̻߳�ȡ����������ں��������ж�λ�ȡ�������Ա��ⱻ�Լ�������������������synchronizedҲ֧�֡�
 */

public class ReentrantLockDemo {
   
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

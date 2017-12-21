package com.base.designpattern;
/**
 * һ��СС��˫��������Ȼ�����кܶ�������
 * ע�⣺volatile��ֹ�Ĳ�singleton = new Singleton()��仰�ڲ�[1-2-3]��ָ�����ţ�
 * ���Ǳ�֤����һ��д������[1-2-3]�����֮ǰ��������ö�������if (instance == null)����
 * @author maoling
 *
 */
public class DoubleCheckedLockingSingleton {  
	//http://www.importnew.com/21141.html
    //һ��Ҫ��static���Σ���̬�಻�ܵ���ʵ������(�Ǿ�̬������); ע��static
	private volatile static DoubleCheckedLockingSingleton instance;
	
	private DoubleCheckedLockingSingleton(){}
	
	//public����
	private static DoubleCheckedLockingSingleton getInstance(){
		if(instance == null){
			synchronized (DoubleCheckedLockingSingleton.class) {
				if(instance == null){
				   instance = new DoubleCheckedLockingSingleton();
				}
			}
			
		}
		return instance;
	}
	
	public static void main(String[] args) {
		DoubleCheckedLockingSingleton instance = DoubleCheckedLockingSingleton.getInstance();
	    System.out.println(instance);
	    DoubleCheckedLockingSingleton instance2 = DoubleCheckedLockingSingleton.getInstance();
	    System.out.println(instance2);
	    DoubleCheckedLockingSingleton instance3 = DoubleCheckedLockingSingleton.getInstance();
	    System.out.println(instance3);
	}
	
}










/*
 *  // java��ʹ��˫�ؼ����������,����Java��������JIT���Ż���ԭ��ϵͳ�޷���֤����������ִ�д���  
        // ��java5.0�޸����ڴ�ģ��,ʹ��volatile�����ı�������ǿ�����α�������JIT���Ż�����  
        private volatile static DoubleCheckedLockingSingleton uniqueInstance;  

        private DoubleCheckedLockingSingleton() {  
        }  
        
        //����������˫����ѽ��
        public static DoubleCheckedLockingSingleton getInstance() {  
                if (uniqueInstance == null) {  
                        synchronized (DoubleCheckedLockingSingleton.class) {  
                                if (uniqueInstance == null) {  
                                        uniqueInstance = new DoubleCheckedLockingSingleton();  
                                }  
                        }  
                }  
                return uniqueInstance;  
        }  
 * 
 * */
 
package com.designpattern;
public class DoubleCheckedLockingSingleton {  
       
	private static DoubleCheckedLockingSingleton instance;
	private DoubleCheckedLockingSingleton(){}
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
 
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
 
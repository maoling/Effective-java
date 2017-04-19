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
 *  // java中使用双重检查锁定机制,由于Java编译器和JIT的优化的原因系统无法保证我们期望的执行次序。  
        // 在java5.0修改了内存模型,使用volatile声明的变量可以强制屏蔽编译器和JIT的优化工作  
        private volatile static DoubleCheckedLockingSingleton uniqueInstance;  

        private DoubleCheckedLockingSingleton() {  
        }  
        
        //大名鼎鼎的双检锁呀！
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
 
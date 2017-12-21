package com.base.designpattern;
/**
 * 一个小小的双检锁，竟然还是有很多玄机！
 * 注意：volatile阻止的不singleton = new Singleton()这句话内部[1-2-3]的指令重排，
 * 而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
 * @author maoling
 *
 */
public class DoubleCheckedLockingSingleton {  
	//http://www.importnew.com/21141.html
    //一定要用static修饰，静态类不能调用实例变量(非静态变量！); 注意static
	private volatile static DoubleCheckedLockingSingleton instance;
	
	private DoubleCheckedLockingSingleton(){}
	
	//public行吗？
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
 
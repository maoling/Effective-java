package com.base.designpattern;
/**
 * 
 * @author maoling
 *
 */
public class DoubleCheckedLockingSingleton {  
	//http://www.importnew.com/21141.html
 
	private volatile static DoubleCheckedLockingSingleton instance;
	
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
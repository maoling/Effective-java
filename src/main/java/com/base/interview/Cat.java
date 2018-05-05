package com.base.interview;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class Animal{
	protected String name = "animal";
	public Animal(){
		System.out.println("I am Animal father");
	}
    void say(){
    	System.out.println("Animal say");
    }
}
public class Cat extends Animal {
	private String name = "cat";
    public Cat(){
        System.out.println("I am a cat");
    }
	void say() {
		// TODO Auto-generated method stub
		System.out.println("cat say!");
	}
	
    public static Cat createTrustManager(List<Animal> list, String trustStorePasswor) throws Exception {
    	FileInputStream inputStream = null;
    	
    	try {
    		
    		char[] chars = trustStorePasswor.toCharArray();
            for (Animal tm : list) {
                if (tm instanceof Cat) {
                    return (Cat) tm;
                }
            }
            throw new Exception("Couldn't find X509TrustManager");
        } catch (Exception e) {   
        	throw new Exception(e);
        } finally {
        	if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {}
            } 
        }
    }
	
	public static void main(String[] args) {
    	/*Animal cat=new Cat();
    	System.out.println(cat.name);
    	cat.say();*/
		List<Animal> list = new ArrayList<>();
		Cat cat = (Cat)null;
		list.add(cat);
		try {
			Cat.createTrustManager(list, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
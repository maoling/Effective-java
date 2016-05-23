package com.test;
class Son extends Father{

    public Son() {
		
	}
    
	@Override
    public void say() {
        //super.say();
        System.out.println("son");
    }
    public void action(String s){
        System.out.println("¶ù×Ó£¡");
    }
}


public class Father {
	public Father(){
    	
    }
    public Father(int n){
    	
    }
    public void say(){
        System.out.println("father");
    }
    
    public void action(){
        System.out.println("°Ö°Ö£¡");
    }
    
    public static void main(String[] args) {
    	int x = 3;
    	System.out.println(x>>3);
    	//x>>3;
    	int y = x>>3;
        Father f=new Son();
        f.say();
        f.action();
    }
}

 
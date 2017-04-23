package com.base.interview;
class Son extends Father{
	private String name = "name:儿子";
    public Son() {
		
	}
    
	@Override
    public void say() {
        //super.say();
        System.out.println("son");
    }
    public void action(String s){
        System.out.println("儿子！");
    }
}


public class Father {
	private String name = "name:爸爸";
	public Father(){
    	
    }
    public Father(int n){
    	
    }
    public void say(){
        System.out.println("father");
    }
    
    public void action(){
        System.out.println("爸爸！");
    }
    
    public static void main(String[] args) {
    	int x = 3;
    	System.out.println(x>>3);
    	//x>>3;
    	int y = x>>3;
    	//变量用父类的，方法用自己的
        Father f = new Son();
        System.out.println(f.name);
        f.say();
        f.action();
    }
}

 
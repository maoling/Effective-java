package com.base.interview;
class Son extends Father{
	private String name = "name:����";
    public Son() {
		
	}
    
	@Override
    public void say() {
        //super.say();
        System.out.println("son");
    }
    public void action(String s){
        System.out.println("���ӣ�");
    }
}


public class Father {
	private String name = "name:�ְ�";
	public Father(){
    	
    }
    public Father(int n){
    	
    }
    public void say(){
        System.out.println("father");
    }
    
    public void action(){
        System.out.println("�ְ֣�");
    }
    
    public static void main(String[] args) {
    	int x = 3;
    	System.out.println(x>>3);
    	//x>>3;
    	int y = x>>3;
    	//�����ø���ģ��������Լ���
        Father f = new Son();
        System.out.println(f.name);
        f.say();
        f.action();
    }
}

 
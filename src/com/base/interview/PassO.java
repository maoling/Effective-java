package com.base.interview;
class Two{
    //Byte x;//��װ����Ĭ��ֵΪnull
    byte x;
}

public class PassO {
   
    void start(){
        Two t = new Two();
        System.out.print(t.x+" ");
        Two t2 = fix(t);
        System.out.print(t.x+" " +t2.x);
    }
    Two fix(Two tt){
        tt.x = 42;
        return tt;
    }
    int function(int n) {
    	if (n <= 2) return n; 
    	if (n == 3) return 4;//1 1 1;2,1;1,2;3
    	return function(n-1) + function(n-2) + function(n-3);
    }
    public static void main(String[] args) {
    	PassO p = new PassO();
        //p.start();
    	System.out.println(p.function(15));
    	
	}
}
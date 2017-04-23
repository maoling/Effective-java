package com.base.interview;
class Two{
    //Byte x;//包装类型默认值为null
    byte x;
}

public class PassO{
    public static void main(String[] args){
        PassO p=new PassO();
        p.start();
    }
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
}
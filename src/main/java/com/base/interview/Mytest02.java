package com.base.interview;
class Mytest02{
    public static void main(String args []){
        Enclosingone.InsideOne obj1 = new Enclosingone().new InsideOne();//非静态内部类对象
        Enclosingone.InsideTwo obj2 = new Enclosingone.InsideTwo();//静态内部类对象
    
        byte b1=1,b2=2,b3,b6,b8;
        final byte b4=4,b5=6,b7;
        //b3=(b1+b2);  /*语句1*/
        b6=b4+b5;    /*语句2*/
        //b8=(b1+b4);  /*语句3*/
        //b7=(b2+b5);  /*语句4*/
        //b8=(b4+b1); 
        //System.out.println(b3+b6);
    }
}
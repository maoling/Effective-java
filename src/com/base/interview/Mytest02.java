package com.base.interview;
class Mytest02{
    public static void main(String args []){
        Enclosingone.InsideOne obj1 = new Enclosingone().new InsideOne();//�Ǿ�̬�ڲ������
        Enclosingone.InsideTwo obj2 = new Enclosingone.InsideTwo();//��̬�ڲ������
    
        byte b1=1,b2=2,b3,b6,b8;
        final byte b4=4,b5=6,b7;
        //b3=(b1+b2);  /*���1*/
        b6=b4+b5;    /*���2*/
        //b8=(b1+b4);  /*���3*/
        //b7=(b2+b5);  /*���4*/
        //b8=(b4+b1); 
        //System.out.println(b3+b6);
    }
}
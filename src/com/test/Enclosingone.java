package com.test;
public class Enclosingone {
    //�Ǿ�̬�ڲ���
    public class InsideOne {}
    //��̬�ڲ���
    public static class InsideTwo{}
    
}
 
class Mytest02{
    public static void main(String args []){
        Enclosingone.InsideOne obj1 = new Enclosingone().new InsideOne();//�Ǿ�̬�ڲ������
        Enclosingone.InsideTwo obj2 = new Enclosingone.InsideTwo();//��̬�ڲ������
    }
}
package com.test;
public class B1
{
    public static B1 t1 = new B1();
    public static B1 t2 = new B1();

    {
        System.out.println("�����");
    }
    static
    {
        System.out.println("��̬��");
    }
    public static void main(String[] args)
    {
        B1 t = new B1();
    }
}
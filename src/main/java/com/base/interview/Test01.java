package com.base.interview;
class Base
{
    public void method()
    {
        System.out.println("Base");
    } 
}
class Son2 extends Base
{
    public void method()
    {
        System.out.println("Son");
    }
     
    public void methodB()
    {
        System.out.println("SonB");
    }
}
public class Test01
{
    public static void main(String[] args)
    {
        Base base = new Son2();
        base.method();
        /**
         * ���new ��һ�������࣬��ֵ�����࣬��������Ĳ�����������Ϊbase�������Base���͵�
           Base���в�����methodB()���������Ա��벻ͨ��
         */
        //base.methodB();don't pass the compiler
        float f = -412;
        float f2 = (float)4.2;
    }
}
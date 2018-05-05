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
         * 这句new 了一个派生类，赋值给基类，所以下面的操作编译器认为base对象就是Base类型的
           Base类中不存在methodB()方法，所以编译不通过
         */
        //base.methodB();don't pass the compiler
        float f = -412;
        float f2 = (float)4.2;
    }
}
package com.base.interview;
class Foo {
    //final int i ;//= 0; //final 类型需要初始化，或者在构造函数里初始化
	final int i = 0;
    int j;
    public void doSomething() {
        System.out.println(++j + i);
        System.out.println("j:"+j);
        System.out.println("i:"+i);
    }
    public static void main(String[] args) {
    	Foo f = new Foo();
    	f.doSomething();
    }
}
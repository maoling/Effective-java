package com.base.interview;
class Foo {
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
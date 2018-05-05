package com.base.designpattern.proxy;
//代理类和被代理类一般实现一个公共的interface
public interface Calculator {
    public Integer add(Integer num1, Integer num2);
    public Integer minus(Integer num1, Integer num2);
    public Integer multiplay(Integer num1, Integer num2);
}
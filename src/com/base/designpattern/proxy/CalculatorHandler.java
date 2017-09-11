package com.base.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorHandler implements InvocationHandler {

	private Object obj;//被代理类
	public CalculatorHandler (Object obj) {
		this.obj = obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorImpl calculatorImpl = new CalculatorImpl();//被代理类
		CalculatorHandler calculatorHandler = new CalculatorHandler(calculatorImpl);
		Calculator calculator = (Calculator) Proxy.newProxyInstance(calculatorImpl.getClass().getClassLoader(), calculatorImpl.getClass().getInterfaces(), calculatorHandler);
		System.out.println(calculator.add(1,2));
		System.out.println(calculator.minus(1, 2));
		System.out.println(calculator.multiplay(3, 4));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("in calculatorhandler, before invocation");
		Object ret = method.invoke(obj, args);//执行被代理类方法
		System.out.println("in calculatorhandler, after invocation");
		
		return ret;
	}

}

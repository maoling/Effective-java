package com.base.interview;

public class Reference {
	
	static void foo(int value) {
	    value = 100;
	}
	static void foo(String text) {
	    text = "windows";
	}
	
	static void foo(StringBuilder builder) {
	    builder.append("4");
	}
	
	
	/*static void foo(StringBuilder builder) {
	    builder = new StringBuilder("ipad");
	}*/
	
	public static void main(String[] args) {
		/*Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);
		Integer c = 128;
		Integer d = 128;
		System.out.println(c==d);*/
		
		// TODO Auto-generated method stub
		//第一个例子：基本类型
		int num = 10;
		foo(num); // num 没有被改变
		System.out.println(num);

		//第二个例子：没有提供改变自身方法的引用类型
		String str = "apple";
		foo(str); // str 也没有被改变
        System.out.println(str);
        
		//第三个例子：提供了改变自身方法的引用类型
		StringBuilder sb = new StringBuilder("iphone");
		foo(sb);
		System.out.println(sb.toString());

		//第四个例子：提供了改变自身方法的引用类型，但是不使用，而是使用赋值运算符。
		//StringBuilder sb = new StringBuilder("iphone");
		//foo(sb);
		//System.out.println(sb.toString());
		 // sb 没有被改变，还是 "iphone"。
		
		
		
	}

}

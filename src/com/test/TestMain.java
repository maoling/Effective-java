package com.test;

import java.util.ArrayList;
import java.util.List;
/*
 * 
1.һ�����������޸�һ�������������͵Ĳ���
2.һ���������Ըı�һ�����������״̬
3.һ�����������ö����������һ���µĶ���*/
public class TestMain {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		add(list);
		for (Integer j : list) {
			System.err.print(j+",");;
		}
		System.err.println("");
		System.err.println("*********************");
		String a = new String("Abcdefg");
		append(a);
		System.err.println(a);
		int num = 5;
		addNum(num);
		System.err.println(num);
		int b=5,c = 10;
		swap(b, c);
		System.out.println(b+" "+c);
		
	}
	
	static void add(List<Integer> list){
		list.add(100);
	}
	
	static void append(String str){
		str = "ooxx";
		System.out.println("str:"+str);
	}
	static void addNum(int a){
		a=a+10;
	}
	static void swap(int A , int B ) {
		int C = A;
		A = B;
		B = C;
	}
}
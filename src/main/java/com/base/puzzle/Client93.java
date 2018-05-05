package com.base.puzzle;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

public class Client93 {

	public void listMethod(List<String> list) {
		
	}
	//Java泛型编译期会类型擦除
	/*public void listMethod(List<Integer> list) {
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		System.out.println(ls.getClass() == li.getClass());
	}

}

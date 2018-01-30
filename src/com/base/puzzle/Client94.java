package com.base.puzzle;

import java.util.ArrayList;
import java.util.List;

//不能初始化泛型参数和数组
public class Client94<T> {

	//private T t = new T();
	//private T[] tArray = new T[5];
	private List<T> list = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

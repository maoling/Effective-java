package com.base.puzzle;

import java.lang.reflect.Array;

public class Client105 {

	public static void main(String[] args) throws Exception {
		String[] strs = new String[10];
		Class.forName("java.lang.String[]");
		//通过反射操作数组使用Array类,不要采用通用的反射处理API
		String[] strs2 = (String[]) Array.newInstance(String.class, 8);
		int[][] innts = (int[][]) Array.newInstance(int.class, 2, 3);
		
	}

}

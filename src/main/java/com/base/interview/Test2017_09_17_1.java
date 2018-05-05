package com.base.interview;

public class Test2017_09_17_1 {	
	public static int getNumber(int n) {
		try {
			int res = n /4;
			return res;
		} catch (Exception e) {
			return 0;
		} finally {
			if (n == 0) return -1;
			if (n == 1) return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(getNumber(0));
		System.out.println(getNumber(1));
		//System.out.println(getNumber(2));
		//System.out.println(getNumber(4));
	}

}

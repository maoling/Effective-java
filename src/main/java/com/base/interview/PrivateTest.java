package com.base.interview;

public class PrivateTest {

	public String zNodePath;
	
	public String getZNodePath() {
		return zNodePath;
	}

	public static void main(String[] args) {
		PrivateTest privateTest = new PrivateTest();
		System.out.println(privateTest.getZNodePath());

	}

}

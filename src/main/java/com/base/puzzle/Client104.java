package com.base.puzzle;

public class Client104 {

	public static void main(String[] args) throws ClassNotFoundException {
		//��̬����
		Class.forName("com.base.puzzle.Utils");
	}
}
class Utils {
	static {
		System.out.println("Do Something");
	}
}

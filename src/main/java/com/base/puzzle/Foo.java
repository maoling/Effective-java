package com.base.puzzle;

import com.base.interview.PrivateTest;

public class Foo {
	public final void doStuff() {
		System.out.println("do stuff!");
		PrivateTest privateTest = new PrivateTest();
		System.out.println(privateTest.getZNodePath());
	}
}

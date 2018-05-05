package com.base.puzzle;

interface Animal {
    public void doStuff();
}

class Rat implements Animal {
	@Override
	public void doStuff() {
		System.out.println("Jerry will play with Tom.");
	}
}

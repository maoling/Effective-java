package com.test;
public class TestConStructor
{
    public TestConStructor()
    {
        System.out.println("constructor");
    }
    public void TestConStructor()
    {
        System.out.println("not constructor");
    }
    
	public static void main(String[] args)
	{
	    TestConStructor testConStructor = new TestConStructor();
	    System.out.println("main");
	    testConStructor.TestConStructor();
	}
}
package com.test;

public class Test_3_31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final String str = "abx";
		//str = "ooxx";
		
		Thread t = new Thread() {
	            public void run() {
	                pong();
	            }
	        };
	      t.run();
	        //t.start();
	      System.out.print("1");
	}
	static void pong() {
        System.out.print("2");
    }

}

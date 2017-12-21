package com.base.interview;

public class Bground extends Thread {
	
    public static void main(String argv[]) {
        Bground b = new Bground();
        b.run();   
    }
    
    public void run() {
        // compute primes larger than minPrime
        System.out.println("ooxx!");
    }
    public void start() {
        for(int i=0;i<10;i++){
            System.out.println("Value of i = "+i);
        }
    }
}

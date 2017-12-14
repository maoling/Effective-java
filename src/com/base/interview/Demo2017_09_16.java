package com.base.interview;

public class Demo2017_09_16 {	
	static int a = 0;
	public static void main(String[] args) {
		System.out.println("is " + 100 + 5);
		//III:
		System.out.println(100 + 5 + "is ");
		System.out.println("is "+(100+5));
		
		// TODO Auto-generated method stub
        Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				boolean isOdd = false;
				for (int i=1; i <= 2; i++) {
					if (i % 2 == 1) isOdd = true;
					else isOdd = false;
					a += i*(isOdd ? 1:-1);
				}
				System.out.println(Thread.currentThread()+" a: "+a);
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
		Thread t2 = new Thread(r);
		t2.start();
		
	}

}

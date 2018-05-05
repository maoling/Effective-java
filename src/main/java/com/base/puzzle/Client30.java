package com.base.puzzle;

import java.util.Random;

public class Client30 {

	public static void main(String[] args) {
	   Random r = new Random(1000);//种子相同，即使实例不同，产生的随机数也相同
	   for (int i = 0; i< 4; i++) {
		   System.out.println(r.nextInt());
	   }
	}
}

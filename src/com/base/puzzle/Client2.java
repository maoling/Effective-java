package com.base.puzzle;

import java.util.Random;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("����Ҳ���ѽ!:" + CONST.RAND_CONST);
	}
}

interface CONST {
	public final static int RAND_CONST = new Random().nextInt(); 
}
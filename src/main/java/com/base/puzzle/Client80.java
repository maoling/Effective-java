package com.base.puzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(); 
        for (int i = 0; i < 10000; i++) {
        	list.add("»ð³µÆ±" + i);
        }
        
        Thread saleThread = new Thread(new Runnable() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (String ticket : list) {
					list.remove(ticket);
				}
			}
		});
        
        Thread returnThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				list.add("»ð³µÆ±" + new Random().nextInt());
			}
		});
        		
        saleThread.start();
        returnThread.start();     
	}

}

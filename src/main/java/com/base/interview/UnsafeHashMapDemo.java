package com.base.interview;

import java.util.HashMap;
import java.util.UUID;

public class UnsafeHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final HashMap<String, String> map = new HashMap<String, String>(2);
		for (int i = 0; i < 10000; i++) {
		    new Thread(new Runnable() {
		        @Override
		        public void run() {
		            map.put(UUID.randomUUID().toString(), "");
		        }
		    }).start();
		}
	}
}

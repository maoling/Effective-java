package com.thread.tradition;

import java.util.Timer;
import java.util.TimerTask;



public class TimerTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("bombing!");
			}
		}, 10*1000);
	}

}

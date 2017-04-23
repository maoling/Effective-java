package com.base.nio;

import java.io.IOException;
import java.net.Socket;

public class ProcessJob implements Runnable {
	private Socket s;
	
	public ProcessJob(Socket s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	    int count = 0;
	    byte[] b = new byte[1024];
	    try {
			while( (count = s.getInputStream().read(b)) > 0){
				System.out.write(b,0,count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

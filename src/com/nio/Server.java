package com.nio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        ServerSocket server = new ServerSocket(9999);
        while(true){
        	Socket s = server.accept();
        	new Thread(new ProcessJob(s)).start();
        }
		
		
	}

}

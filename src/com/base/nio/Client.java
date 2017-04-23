package com.base.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Socket client = new Socket("127.0.0.1",9999);
        OutputStream out = client.getOutputStream();
        String hello = "hello!";
        out.write(hello.getBytes());
        out.flush();
        client.close();
	}

}

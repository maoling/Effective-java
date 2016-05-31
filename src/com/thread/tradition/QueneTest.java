package com.thread.tradition;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class QueneTest {

	public static void main(String[] args) {
		//final Semaphore semaphore = new Semaphore(1);
		//final SynchronousQueue<String> queue = new SynchronousQueue<String>();
		
		final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
		
		for(int i=0;i<4;i++){
			new Thread(new Runnable(){
				@Override
				public void run(){	
					while(true){
						try {
							//semaphore.acquire();
							String input = queue.take();
							String output = TestDo.doSome(input);
							System.out.println(Thread.currentThread().getName()+ "�Ѿ�������:" +"��־����"+ output);
							//semaphore.release();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
						
					}		
				}
			}).start();
		}
		
		System.out.println("begin:"+(System.currentTimeMillis()/1000));
		for(int i=0;i<16;i++){  //���в��ܸĶ�
			String input = i +" ";  //���в��ܸĶ�
			try {
				queue.put(input);
				System.out.println("��־����"+(i)+"�Ѿ������������:");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//���ܸĶ���TestDo��
class TestDo {
	public static String doSome(String input){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String output = input + ":"+ (System.currentTimeMillis() / 1000);
		return output;
	}
}

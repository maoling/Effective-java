package com.base.thread.tradition;

/*
 * http://www.cnblogs.com/luxiaoxun/p/3870265.html
 * */
//import org.apache.log4j.Logger;

public class TicketsTest {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread th1 = new Thread(mr, "����1");
		Thread th2 = new Thread(mr, "����2");
		Thread th3 = new Thread(mr, "����3");

		th1.start();
		th2.start();
		th3.start();
	}
}

class MyRunnable implements Runnable {
	// ��־�ļ�����
	//private static Logger logger = Logger.getLogger(MyRunnable.class);
	private int ticketsCount = 100;

	@Override
	public void run() {

		synchronized (this) {

			int i = 1;
			while (ticketsCount > 0) {

				try {
					Thread.sleep(200);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				ticketsCount--;
//				//logger.debug(Thread.currentThread().getName() + "����һ��Ʊ,�ܹ��Ѿ�����"
//						+ (i++) + ",��ʣ�£�" + ticketsCount);

				if (ticketsCount == 0) {
					return;
				}

			}
		}
	}

	/*
	 * @Override ���ַ�ʽΪʲôֻ��һ���߳������� public synchronized void run() {
	 * 
	 * while (ticketsCount > 0) { try { Thread.sleep(20);
	 * 
	 * } catch (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * ticketsCount--; logger.debug(Thread.currentThread().getName() +
	 * " ����һ��Ʊ����ʣ�£�" + ticketsCount);
	 * 
	 * } }
	 */
}
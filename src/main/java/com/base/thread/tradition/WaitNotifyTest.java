package com.base.thread.tradition;

public class WaitNotifyTest {

	Object myMonitorObject = new Object();
	boolean wasSignalled = false;

	public void doWait() {
		synchronized (myMonitorObject) {
			while (!wasSignalled) {
				try {
					myMonitorObject.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// clear signal and continue running.
			wasSignalled = false;
		}
	}

	public void doNotify() {
		synchronized (myMonitorObject) {
			wasSignalled = true;
			myMonitorObject.notify();
		}
	}

	public static void main(String[] args) {
		WaitNotifyTest wnt = new WaitNotifyTest();
	}
}
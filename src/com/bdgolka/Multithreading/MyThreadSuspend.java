package com.bdgolka.Multithreading;

public class MyThreadSuspend implements Runnable {

	Thread thrd;

	volatile boolean suspended; // Suspended Thread if true
	volatile boolean stopped; // Stop Thread if true

	public MyThreadSuspend(String name) {

		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}

	public void run() {
		System.out.println(thrd.getName() + " - started");

		try {

			for (int i = 0; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}

				// This block uses for testing suspended and stop
				synchronized (this) {
					while (suspended) {
						wait();
					}
					if (stopped)
						break;
				}
			}

		} catch (InterruptedException e) {
			System.out.println(thrd.getName() + " - iterrupted");
		}

		System.out.println(thrd.getName() + " - exit");
	}

	// Stop the Thread
	synchronized void mystop() {

		stopped = true;

		suspended = false;

		notify();
	}

	// Suspend the Thread
	synchronized void mysuspend() {

		suspended = true;

		notify();
	}

	// Resume the Tread
	synchronized void myresume() {
		suspended = false;

		notify();
	}

}

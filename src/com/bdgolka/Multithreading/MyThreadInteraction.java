package com.bdgolka.Multithreading;

public class MyThreadInteraction implements Runnable {

	Thread thrd;
	TickTock ttOb;

	// Create a new Thread
	public MyThreadInteraction(String name, TickTock tt) {

		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start();
	}

	public void run() {
		if (thrd.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++)
				ttOb.tick(true);
			ttOb.tick(false);
		} else {
			for (int i = 0; i < 5; i++)
				ttOb.tock(true);
			ttOb.tock(false);
		}

	}

}

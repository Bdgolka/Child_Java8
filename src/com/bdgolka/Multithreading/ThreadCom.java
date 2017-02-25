package com.bdgolka.Multithreading;

public class ThreadCom {

	// Entry point for TickTock
	public static void main(String[] args) {

		TickTock tt = new TickTock();
		MyThreadInteraction mt1 = new MyThreadInteraction("Tick", tt);
		MyThreadInteraction mt2 = new MyThreadInteraction("Tock", tt);

		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}

	}

}

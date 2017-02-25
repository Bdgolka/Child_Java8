package com.bdgolka.Multithreading;

public class MoreThreadsJoin {

	public static void main(String[] args) {

		System.out.println("Start new Thread");

		MyThreadRunnable mt1 = new MyThreadRunnable("Child #1");
		MyThreadRunnable mt2 = new MyThreadRunnable("Child #2");
		MyThreadRunnable mt3 = new MyThreadRunnable("Child #3");

		try {
			mt1.thrd.join();
			System.out.println("Child #1 joined");
			mt2.thrd.join();
			System.out.println("Child #2 joined");
			mt3.thrd.join();
			System.out.println("Child #3 joined");
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}

		System.out.println("Main Thread Finished");
	}

}

package com.bdgolka.Multithreading;

public class MoreThreadsIsAlive {

	public static void main(String[] args) {

		System.out.println("Start new Thread");

		MyThreadRunnable mt1 = new MyThreadRunnable("Child #1");
		MyThreadRunnable mt2 = new MyThreadRunnable("Child #2");
		MyThreadRunnable mt3 = new MyThreadRunnable("Child #3");

		do {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main Thread Interrupted");
			}
		}
		while(mt1.thrd.isAlive() ||
				mt2.thrd.isAlive()||
				mt3.thrd.isAlive());
		System.out.println("Main Thread Finished");
	}

}

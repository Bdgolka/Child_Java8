package com.bdgolka.Multithreading;

public class ExtendThread {

	public static void main(String[] args) {

		System.out.println("Start new Thread");

		MyThread mt = new MyThread("Child #1");

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				mt.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main Thread Interrupted");
			}
		}
		System.out.println("Main Thread Finished");
	}

}

package com.bdgolka.Multithreading;

public class PriorityDemo {

	public static void main(String[] args) {

		Priority mt1 = new Priority("Hight priority");
		Priority mt2 = new Priority("Low priority");
		
		//Set Priority
		mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);
		
		//Run Threads
		mt1.thrd.start();
		mt2.thrd.start();
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
			
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("\n Hight Priority Thread Counter: " + mt1.count);
		System.out.println("\n Low Priority Thread Counter: " + mt2.count);
	}
}

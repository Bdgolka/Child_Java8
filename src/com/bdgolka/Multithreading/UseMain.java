package com.bdgolka.Multithreading;

/*
 * Main Thread control
 */
public class UseMain {

	public static void main(String args[]) {

		Thread thrd;

		// Get a new Thread
		thrd = Thread.currentThread();

		// Print the name of the main thread
		System.out.println("Main thread name : " + thrd.getName());

		// Show main thread priority
		System.out.println("Main thread priority : " + thrd.getPriority());

		System.out.println();

		// Set name and priority for the main Thread
		System.out.println("Set name and priority\n");
		thrd.setName("Thread #1");
		thrd.setPriority(Thread.NORM_PRIORITY + 3);

		System.out.println("New main thread name: " + thrd.getName());
		System.out.println("New main thread priority: " + thrd.getPriority());
	}

}

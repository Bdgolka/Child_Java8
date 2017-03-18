package com.bdgolka.generics;

public class GenQueueDemo {

	public static void main(String[] args) {

		// Create a queue to store integers
		Integer iStore[] = new Integer[10];

		GenQueue<Integer> q = new GenQueue<>(iStore);

		Integer iVal;

		System.out.println("Integer Queue");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Put " + i + " in queue q");
				// Put Integer to the queue
				q.put(i);
			}
		} catch (QueueFullExeption e) {
			System.out.println(e);
		}

		System.out.println();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Get next Integer from queue q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}

		// Create queue to store Double
		Double dStore[] = new Double[10];
		GenQueue<Double> q2 = new GenQueue<>(dStore);

		Double dVal;

		System.out.println("Integer Queue");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Put " + (double) i / 2 + " in queue q2");
				// Put Integer to the queue
				q2.put((double) i / 2);
			}
		} catch (QueueFullExeption e) {
			System.out.println(e);
		}

		System.out.println();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Get next Integer from queue q2: ");
				dVal = q2.get();
				System.out.println(dVal);
			}
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}

	}

}

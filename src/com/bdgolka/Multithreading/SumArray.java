package com.bdgolka.Multithreading;

import javax.swing.event.TreeWillExpandListener;

public class SumArray {
	private int sum;

	/*synchronized*/ int sumArray(int nums[]) {
		sum = 0; // set sum to zero

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			System.out.println("Current sum value for " + Thread.currentThread().getName() + ": " + sum);

			try {
				Thread.sleep(10); // allow task switching
			} catch (InterruptedException e) {
				System.out.println("Main Thread interruption");
			}
		}

		return sum;

	}

}

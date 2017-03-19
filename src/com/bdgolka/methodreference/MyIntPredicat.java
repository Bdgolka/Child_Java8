package com.bdgolka.methodreference;

/*
 * This class defines three static methods 
 * that check if all number match the specific conditions
 */

public class MyIntPredicat {

	// Static method that returns true,
	// when given number is prime
	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= n / i; i++) {
			if ((n % i) == 0)
				return false;
		}

		return true;
	}

	// Static method that if given number is even
	static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	// Static method that returns true
	// if given number is positive
	static boolean isPositive(int n) {
		return n > 0;
	}
}

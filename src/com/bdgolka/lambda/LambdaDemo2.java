package com.bdgolka.lambda;

public class LambdaDemo2 {

	public static void main(String[] args) {
		// Check if numbers are multiples
		NumericTest isFactor = (n, d) -> (n % d) == 0;

		if (isFactor.test(10, 2))
			System.out.println("2 is a divisor of 10");
		if (!isFactor.test(10, 3))
			System.out.println("3 is not a divisor of 10");
		System.out.println();
		
		//This lambda expression return true, if 
		//first argument is less than second
		NumericTest lessThan = (n, m) -> (n < m);
		
		if (lessThan.test(2,  10))
			System.out.println("2 less than 10");
		if (!lessThan.test(10,  2))
			System.out.println("10 is not less than 2");
		System.out.println();
		
		//This statement return true if both argument are equal in absolute value
		NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
		
		if(absEqual.test(4, -4))
			System.out.println("Absolut values 4 and -4 are equal");
		if(absEqual.test(4, -5))
			System.out.println("Absolut values 4 and -5 are equal");
		System.out.println();

	}

}

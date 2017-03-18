package com.bdgolka.lambda;

public class GenericFunctionaInterfaceDemo {

	public static void main(String[] args) {
		// This lambda expression checks
		// whether one integer number is a divisor of other
		SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

		if (isFactor.test(10, 2))
			System.out.println("2 is a divisor for 10");
		System.out.println();

		// This lambda expression checks
		// whether one double number is a divisor of other
		SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

		if (isFactorD.test(212.0, 4.0))
			System.out.println("212.0 is a divisor for 4.0");
		System.out.println();

		// This lambda expression checks
		// whether one string is a part of other
		SomeTest<String> isIn = (a, b) -> a.indexOf(b)!=-1;
		
		String str = "Generic functional interface" ;
		
		System.out.println("String for test: " + str);
		
		if(isIn.test(str, "face"))
		System.out.println("'face' was found");
		else
			System.out.println("'face' wasn't found");
	}

}

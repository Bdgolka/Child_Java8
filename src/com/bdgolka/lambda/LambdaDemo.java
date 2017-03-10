package com.bdgolka.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		// Declare interface reference
		MyValue myVal;

		/**
		 * Here is lambda expression is just a constant when it assign to
		 * variable myVal an instance of class created, where lambda expression
		 * realized method getValue in interface MyValue
		 */
		myVal = () -> 98.6;

		/**
		 * Call getValue() method, earlier
		 * assign to lambda expression
		 */
		System.out.println("Constant value: " +
		 myVal.getValue());
		
		
		// Create parametrized lambda expression 
		 MyParamValue myPval = (n) -> 1.0/n;
		 
		 System.out.println("The inverce value of 4 is " + myPval.getValue(4.0));
		 System.out.println("The inverce value of 8 is " + myPval.getValue(8.0));
		 
	}

}

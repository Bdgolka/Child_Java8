package com.bdgolka.methodreference;

public class MethodRefDemo {
	
	/**
	 * In that method type of the first parameter
	 * is functional interface. Therefore it could
	 * pass reference to any instance of this interface
	 * including instance created by reference to a method 
	 */
	static boolean numTest(IntPredicate p, int v){
		return p.test(v);
	}
	

	public static void main(String args[]){
		
		boolean result;
		
		//Here is in method numTest() transmitted reference to method isPrime()
		result = numTest(MyIntPredicat::isPrime, 17);
		if(result) System.out.println("17 is a prime number");
		
		//Here is in method numTest() transmitted reference to method isEven()
		result = numTest(MyIntPredicat::isEven, 12);
		if(result) System.out.println("12 is an even number");
		
		//Here is in method numTest() transmitted reference to method isPossitive()
		result = numTest(MyIntPredicat::isPositive , 11);
		if(result) System.out.println("11 is possitive number");
	}
}

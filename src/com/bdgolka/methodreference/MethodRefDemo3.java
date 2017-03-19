package com.bdgolka.methodreference;

public class MethodRefDemo3 {

	public static void main(String[] args) {

		boolean result;

		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);

		// Create reference inp to instance of method isFactor
		MyIntNumPredicate inp = MyIntNum::isFactor;

		// Call method isFactor() for object myNum
		result = inp.test(myNum, 3);
		if (result)
			System.out.println("3 is a divisor of " + myNum.getNum());

		// Call method isFactor() for object myNum2
		result = inp.test(myNum2, 3);
		if (!result)
			System.out.println("3 is not a divisor of " + myNum2.getNum());
	}

}

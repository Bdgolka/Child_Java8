package com.bdgolka.methodreference;

import javax.sound.sampled.ReverbType;

/*
 * Class MyIntNum implementation
 */
public class MethodReDemo2 {

	public static void main(String[] args) {
		boolean result;
		
		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);
		
		//Create reference ip on Method isFactor
		IntPredicate ip = myNum::isFactor;
		
		//Use reference to call method isFactor
		//through the method test()
		result = ip.test(3);
		if (result) System.out.println("3 is a divisor of " + myNum.getNum());
		
		//Create a reference to method isFactor for object myNum2
		//and use it for call method isFactor() through method test()
		ip = myNum2::isFactor;
		result = ip.test(3);
		if(!result) System.out.println("3 is not a divisor of "+ myNum2.getNum());
	}

}

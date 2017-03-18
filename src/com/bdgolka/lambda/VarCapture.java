package com.bdgolka.lambda;

public class VarCapture {

	public static void main(String[] args) {
		// local variable that could be captured
		int num = 10;
		
		MyFunc myLambda = (n) -> {
			//it is correct to use use num like this
			//it is value doesn't changed
			int v = num + n;
			
			//it is incorrect to use nm like this 
			//num++;
			return v;
		};
	}

	//it is also incorrect
	// num = 9;
}

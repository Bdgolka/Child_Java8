package com.bdgolka.methodreference;

/*
 * This class stores value type int and define method
 * isFactor() that returns true if it's argument
 * is a divisor of the number that store in class 
 */
public class MyIntNum {
	private int v;
	
	public MyIntNum(int x) {
		v = x;
	}
	
	int getNum(){
		return v;
	}
	
	//Return true if n is a divisor of v
	boolean isFactor(int n){
		return (v%n) == 0;
	}
	
}

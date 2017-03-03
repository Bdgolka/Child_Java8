package com.bdgolka.generics;
/*
 * Generic class with limited type
 * Entry point class BoundDemo
 */
public class NumericFns<T extends Number> {
	T num;
	
	public NumericFns(T n) {
		num = n;
	}
	
	//Return reciprocal value
	double reciprocal(){
		return 1/num.doubleValue();
	}
	
	//Return fractional part
	double fraction(){
		return num.doubleValue() - num.intValue();
	}
	
	//Check equality of the absolute values of two arguments
	//using template argument
	boolean absEquals(NumericFns<?> ob){
		if(Math.abs(num.doubleValue())==
				Math.abs(ob.num.doubleValue())) return true;
		return false;
	}

}

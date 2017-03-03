package com.bdgolka.generics;

public class BoundDemo {

	public static void main(String[] args) {
		
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		
		System.out.println("Reciprocal value of iOb " + iOb.reciprocal());
		System.out.println("Fractional part of iOb " + iOb.fraction());
		
		System.out.println();
		
		//Double is also acceptable
		NumericFns<Double> dOb = new NumericFns(5.25);
		
		System.out.println("Reciprocal value of dOb " + dOb.reciprocal());
		System.out.println("Fractional part of dOb " + dOb.fraction());
		
		System.out.println("Compare iOb and dOb");
		if(iOb.absEquals(dOb))
			System.out.println("Absolute values match");
		else
			System.out.println("Absolute values are different");
	}
}

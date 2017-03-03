package com.bdgolka.generics;

public class SimpGen {

	public static void main(String[] args) {

		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88,
				"Generics");

		// Show types
		tgObj.showTypes();

		// Get and show values
		System.out.println("value: " + tgObj.getOb1());
		System.out.println("value: " + tgObj.getOb2());
	}

}

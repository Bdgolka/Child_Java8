package com.bdgolka.generics;

//Generic class demonstration
public class GetDemo {

	public static void main(String[] args) {

		//Create a reference to Object of type Integer
		Gen<Integer> iOb;
		
		//Create an object with type Gen<Integer>
		iOb = new Gen<Integer>(88);
		
		//Show data type in obkect iOb
		iOb.showType();
		
		//Get value from object iOb
		int v = iOb.getob();
		System.out.println("value: " + v);
		
		System.out.println();
		
		//Create object with type String
		Gen<String> strOb = new Gen<String>("Generic test");
		
		strOb.showType();
		
		String str = strOb.getob();
		System.out.println("value: " + str);
	}

}

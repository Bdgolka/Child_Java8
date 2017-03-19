package com.bdgolka.constructorreference;

public class MyClass {
	private String str;
	
	//This constructor takes an argument
	public MyClass(String s) {
		str = s;
	}

	//This is default constructor
	public MyClass() {
		str = "";
	}
	
	//...
	
	String getStr(){
		return str;
	}
}

package com.bdgolka.constructorreference;

public class ConstructorRefDemo {

	public static void main(String[] args) {
		/*
		 * Create a reference to constructor MyClass
		 * as method func() of interface MyFunc takes argument
		 * new refer to parameterized constructor MyClass
		 * but not on default constructor
		 */
		MyFunc myClassCons = MyClass::new;
		
		//Create an instance of MyClass
		MyClass mc = myClassCons.func("Test");
		
		//Using of just created instance of MyClass
		System.out.println("Line str in mc: " + mc.getStr());

	}

}

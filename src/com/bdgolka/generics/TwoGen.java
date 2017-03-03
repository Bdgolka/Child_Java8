package com.bdgolka.generics;

//Simple Generic class with two parameterized types: T and V
//Entry point class SimpGen
public class TwoGen<T, V> {

	T ob1;
	V ob2;

	// Constructor
	public TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	// Show types T and V
	void showTypes() {
		System.out.println("Type T it is " + ob1.getClass().getName());
		System.out.println("Type V it is " + ob2.getClass().getName());
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}
}

package com.bdgolka.generics;
/*
 * Simple generic class
 * where T is a type parameter, that
 *  will be substitute with existing type
 * when created an object of class Gen
 */
public class Gen<T> {
	
	T ob;
	
	public Gen(T o) {
		ob = o;
	}
	
	//Return object ob from method
	T getob(){
		return ob;
	}
	
	//Show type T
	void showType(){
		System.out.println("Type T is " + ob.getClass().getName());
	}

}

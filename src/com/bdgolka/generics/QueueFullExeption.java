package com.bdgolka.generics;

//Exception that indicates queue overloading
public class QueueFullExeption extends Exception {
	int size;
	
	public QueueFullExeption(int s) {
	
		size = s;
	}
	
	public String toString(){
		return "\n Queue is full. Max queue size is: " + size;
	}
	
}

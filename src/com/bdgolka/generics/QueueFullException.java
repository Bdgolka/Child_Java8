package com.bdgolka.generics;

//Exception indicating queue overflow
public class QueueFullException extends Exception {
	int size;
	
	public QueueFullException(int s) {
		size = s;
	}
	
	public String toString(){
		return "Queue is full. Max size of queue is: " + size;
	}
}

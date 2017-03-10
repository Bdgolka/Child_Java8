package com.bdgolka.generics;

//Exception that indicates emptiness of the queue
public class QueueEmptyException extends Exception {

	public String toString(){
		return "\n This queue is empty";
	}
}

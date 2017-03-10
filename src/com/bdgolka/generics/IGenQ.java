package com.bdgolka.generics;

//Generic queue interface
public interface IGenQ<T> {
	//put elements in the queue
	void put(T ch) throws QueueFullException;
	
	//get elements for the queue
	T get() throws QueueEmptyException;	
}

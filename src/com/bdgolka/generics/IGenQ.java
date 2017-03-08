package com.bdgolka.generics;

//Queue generic interface
public interface IGenQ<T> {

	//Put element in the queue
	void put (T ch) throws QueueFullExeption;
	
	//Get an element from the Queue
	T get() throws QueueEmptyExceprtion;
}

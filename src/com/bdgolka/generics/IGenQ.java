package com.bdgolka.generics;

<<<<<<< HEAD
//Generic queue interface
public interface IGenQ<T> {
	//put elements in the queue
	void put(T ch) throws QueueFullException;
	
	//get elements for the queue
	T get() throws QueueEmptyException;	
=======
//Queue generic interface
public interface IGenQ<T> {

	//Put element in the queue
	void put (T ch) throws QueueFullExeption;
	
	//Get an element from the Queue
	T get() throws QueueEmptyExceprtion;
>>>>>>> origin/master
}

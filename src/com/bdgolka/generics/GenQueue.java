package com.bdgolka.generics;

//Generic class that implement fix size queue
public class GenQueue<T> implements IGenQ<T> {

	//array to store queue elements
	private T q[];
	
	//put and get queue index
	private int putloc, getloc;
	
	//Create an empty queue
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	
	//Put element in the queue
	public void put(T obj) throws QueueFullExeption {
		
		if(putloc == q.length - 1)
			throw new QueueFullExeption(q.length);

		q[putloc++] = obj; 
	}

	//Get element from the queue
	public T get() throws QueueEmptyExceprtion {

		if (getloc == putloc)
			throw new QueueEmptyExceprtion();
			
		return q[getloc++];
	}

}

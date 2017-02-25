package com.bdgolka.Multithreading;

public class Sync {
	
	public static void main(String args[]){
		
		int a[] = {1, 2, 3, 4, 5};
		
		MyThreadSync mt1 = new MyThreadSync("Child #1", a);
		MyThreadSync mt2 = new MyThreadSync("Child #2", a);
	}

}

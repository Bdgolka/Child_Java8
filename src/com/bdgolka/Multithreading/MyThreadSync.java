package com.bdgolka.Multithreading;

public class MyThreadSync implements Runnable {
	
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	//Create a new Thread
	public MyThreadSync(String name, int nums[]) {
		
		thrd = new Thread(this, name);
		a = nums;
		thrd.start();
	}

	//Start executing of new Thread
	public void run() {

		int sum;
		
		System.out.println(thrd.getName()+ " - start");
		
		//Synchronized block
		synchronized (a) {
			answer = sa.sumArray(a);
		}
		
		System.out.println("SUM for " + thrd.getName() + ": " + answer);
		
		System.out.println(thrd.getName() + " - finish"); 
	}

}

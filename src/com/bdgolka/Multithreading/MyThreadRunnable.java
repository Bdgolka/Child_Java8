package com.bdgolka.Multithreading;

public class MyThreadRunnable implements Runnable {
	
	Thread thrd;

	public MyThreadRunnable(String name) {
		thrd = new Thread(this, name);
		thrd.start();
	}

	@Override
	public void run() {
		System.out.println(thrd.getName() + " - started");
		
		try {
			for (int count = 0; count <10; count++){
				Thread.sleep(400);
				System.out.println("In " + thrd.getName()+ 
						", counter: " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(thrd.getName() + " - interrupted");
		}
		System.out.println(thrd.getName() + " - finished");
	}

}

package com.bdgolka.Multithreading;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name); 
		start();
	}

	@Override
	public void run() {
		System.out.println(getName() + " - star");
		
		try {
			for (int count = 0; count <10; count++){
				Thread.sleep(400);
				System.out.println("In " + getName()+ 
						", counter: " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(getName() + " - interrupted");
		}
		System.out.println(getName() + " - finished");
	}

}

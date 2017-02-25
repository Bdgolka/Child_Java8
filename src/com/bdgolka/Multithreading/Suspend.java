package com.bdgolka.Multithreading;

public class Suspend {

	public static void main(String[] args) {
		
		MyThreadSuspend ob1 = new MyThreadSuspend("My Thread");
		
		try {
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Suspend the Thread");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Resume the Thread");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Suspend the Thread");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Resume the Thread");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Stop the Thread");
			ob1.mystop();
			
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted");
			
		}
		
		//Waiting for Main Thread finished
		try {
			ob1.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}

		System.out.println("Main Thread finished");
	}

}

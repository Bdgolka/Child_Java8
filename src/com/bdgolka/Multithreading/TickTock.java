package com.bdgolka.Multithreading;

//Using methods wait() and notify for clocks imitation
public class TickTock {
	
	String state; // Contains information about clocks status
	
	synchronized void tick(boolean running){
		if(!running){//stop the clock
			state = "ticked";
			notify();//notify waiting threads
			return;
		}
		
		System.out.println("Tick");
		
		state = "ticked";//set current state after tact "tick"
		
		notify();//let method tock() execute
		try {
			while (!state.equals("tocked")) {
				wait();//wait before tock() finished				
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
	
	synchronized void tock(boolean running){
		
		if(!running){//stop the clock
			state = "tocked";
			notify();//notify waiting threads
			return;
		}
		
	System.out.println("Tock");
		
		state = "tocked";//set current state after tact "tick"
		
		notify();//let method tick() execute
		try {
			while (!state.equals("ticked")) {
				wait();//wait before tick() finished				
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}

}

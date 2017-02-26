package com.bdgolka.enumerations;

//Automated Traffic Light Control
public class TrafficLightSimulator implements Runnable {

	// Thread for imitation
	private Thread thrd;

	// Current Traffic Light color
	private TrafficLightColor tlc;

	// To stop the imitation set true
	boolean stop = false;

	// true if Traffic Light changed
	boolean changed = false;

	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;

		thrd = new Thread(this);
		thrd.start();
	}

	TrafficLightSimulator() {

		tlc = TrafficLightColor.RED;

		thrd = new Thread(this);
		thrd.start();
	}

	// Start Traffic Light imitation
	public void run() {

		while (!stop) {

			try {
				switch (tlc) {
				case GREEN:
					Thread.sleep(10000);// Green for 10 sec
					break;
				case YELLOW:
					Thread.sleep(2000);// Yellow for 2 sec
					break;
				case RED:
					Thread.sleep(12000);// Red for 12 sec
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}

	}

	synchronized void changeColor() {

		switch (tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;			
		}

		changed = true;
		notify();
	}

	// Wait for Traffic Light change
	synchronized void waitForChange() {
		try {
			while (!changed)
				wait();// wait for traffic light change
			
			changed = false;

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	// Return current Traffic Light color
	TrafficLightColor getColor() {
		return tlc;
	}

	// Stop Traffic Light imitation
	void cancel() {
		stop = true;
	}

}

package com.lyes.elevator;

public class Cabine {

	private enum flows{
		UP,DOWN,STOPPED
	}
	
	private int floor;
	private flows flow;
	
	public Cabine(int floor) {
		this.floor = floor;
		this.flow = flows.STOPPED;
	}
	
	public void move() {
		Thread t = new Thread(new Sensor());
		t.start();
	}
	

}

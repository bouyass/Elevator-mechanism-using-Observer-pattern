package com.lyes.elevator;

public class Cabine {

	private enum flows{
		UP,DOWN,STOPPED
	}
	
	private int floor;
	private int oldFloor;
	private flows flow;
	
	public Cabine(int floor) {
		this.floor = floor;
		this.oldFloor = 0;
		this.flow = flows.STOPPED;
	}
	
	public int getOldFloor() {
		return oldFloor;
	}

	public void setOldFloor(int oldFloor) {
		this.oldFloor = oldFloor;
	}

	public void move() {
		
		Thread t1 = new Thread(new FirstSensor());
		Thread t2 = new Thread(new SecondSensor());
		Thread t3 = new Thread(new ThirdSensor());
		
		t1.start();
		t2.start();
		t3.start();

	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public flows getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		if(flow>0) {
			this.flow = flows.UP;
		}else if(flow<0) {
			this.flow = flows.DOWN;
		}else {
			this.flow = flows.STOPPED;
		}
	}

	@Override
	public String toString() {
		return "Cabine cuurentl in the floor=" + floor + ", was in the floor oldFloor=" + oldFloor + " and currently flow=" + flow + " direction";
	}
	

}

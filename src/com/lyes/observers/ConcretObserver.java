package com.lyes.observers;

import java.util.List;

import com.lyes.elevator.Sensor;

public class ConcretObserver extends Observer{
	
	public ConcretObserver(List<Sensor> sensors) {
		super(sensors);
		for(Sensor s:sensors) {
			s.attach(this);
		}
	}

	@Override
	public void update(int floorNumber) {
		System.out.println("first sensor notification from "+ floorNumber);
		this.cabine.setOldFloor(this.cabine.getFloor());
		this.cabine.setFloor(floorNumber);
		this.cabine.setFlow(this.cabine.getFloor()-this.cabine.getOldFloor());
		this.cabine.toString();
	}

}

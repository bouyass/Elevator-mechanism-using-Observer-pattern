package com.lyes.observers;

import java.util.List;

import com.lyes.elevator.Cabine;
import com.lyes.elevator.Sensor;

public abstract class Observer {
	
	protected List<Sensor> sensors;
	protected Cabine cabine;
	
	public Observer(List<Sensor> sensors) {
		this.sensors = sensors;
	}
	
	public abstract void update(int floorNumber);
}

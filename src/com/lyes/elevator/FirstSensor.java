package com.lyes.elevator;

import java.util.ArrayList;

import com.lyes.observers.Observer;

public class FirstSensor extends Sensor {
	
	
	
	public FirstSensor() {
		FirstSensor.floorNumber = 0;
		observers = new ArrayList<Observer>();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		try {
			
			Thread.sleep(1000);
			
			notifyAllObservers();
					
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			Thread.currentThread().stop();
		}
	}


	@Override
	public void notifyAllObservers() {
		System.out.println("tird "+FirstSensor.floorNumber);
		for(Observer obs:observers) {
			obs.update(FirstSensor.floorNumber);
		}
	}

	@Override
	public void attach(Observer obs) {
		this.observers.add(obs);
	}
}

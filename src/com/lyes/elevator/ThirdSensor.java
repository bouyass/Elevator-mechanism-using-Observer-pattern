package com.lyes.elevator;

import java.util.ArrayList;

import com.lyes.observers.Observer;

public class ThirdSensor extends Sensor{
	
	
	
	public ThirdSensor() {
		ThirdSensor.floorNumber = 2;
		observers = new ArrayList<Observer>();
	}
	@Override
	public void run() {
		try {
			Thread.sleep(6000);
			
			
			notifyAllObservers();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			Thread.currentThread().stop();
		}
	}
	
	
	@Override
	public void notifyAllObservers() {
		System.out.println("tird "+ThirdSensor.floorNumber);
		for(Observer obs:observers) {
			obs.update(ThirdSensor.floorNumber);
		}
		
	}

	@Override
	public void attach(Observer obs) {
		this.observers.add(obs);
	}
	
	
}

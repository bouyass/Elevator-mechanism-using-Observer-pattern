package com.lyes.elevator;

import java.util.ArrayList;

import com.lyes.observers.Observer;

public class SecondSensor extends Sensor{
	
	public SecondSensor() {
		SecondSensor.floorNumber = 1;
		observers = new ArrayList<Observer>();
		
	}
	
	@Override
	public void run() {
		System.out.println("second "+SecondSensor.floorNumber);
		try {

			Thread.sleep(3000);
			
			notifyAllObservers();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			Thread.currentThread().stop();
		}
	}

	@Override
	public void notifyAllObservers() {
		
		for(Observer obs:observers) {
			obs.update(SecondSensor.floorNumber);
		}
		
	}

	@Override
	public void attach(Observer obs) {
		this.observers.add(obs);
	}
}

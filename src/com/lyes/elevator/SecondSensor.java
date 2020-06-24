package com.lyes.elevator;

import java.util.ArrayList;

import com.lyes.observers.Observer;

public class SecondSensor extends Sensor{
	
	public SecondSensor() {
		this.floorNumber = 1;
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void run() {
		
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
		System.out.println("Second sensor notif");
		for(Observer obs:observers) {
			obs.update(this.floorNumber);
		}
		
	}

	@Override
	public void attach(Observer obs) {
		this.observers.add(obs);
	}
}

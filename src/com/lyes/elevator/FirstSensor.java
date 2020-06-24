package com.lyes.elevator;

import java.util.ArrayList;

import com.lyes.observers.Observer;

public class FirstSensor extends Sensor {
	
	
	
	public FirstSensor() {
		this.floorNumber = 0;
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void run() {
		try {
			
			Thread.sleep(1000);
			
			
			notifyAllObservers();
					
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			Thread.currentThread().stop();
		}
	}


	@Override
	public void notifyAllObservers() {
		System.out.println("first sensor notification");
		System.out.println("taille "+ observers.size());
		for(Observer obs:observers) {
			System.out.println("obs notified");
			obs.update(this.floorNumber);
		}
	}

	@Override
	public void attach(Observer obs) {
		this.observers.add(obs);
	}
}

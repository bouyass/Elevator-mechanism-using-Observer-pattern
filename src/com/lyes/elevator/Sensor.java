package com.lyes.elevator;

import java.util.List;

import com.lyes.observers.Observer;

public abstract class Sensor implements Runnable{
	
	protected static int floorNumber;
	protected List<Observer> observers;
	
	public abstract void attach(Observer obs);
	public abstract void notifyAllObservers();

}

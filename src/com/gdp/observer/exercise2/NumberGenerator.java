package com.gdp.observer.exercise2;

import java.util.ArrayList;

public abstract class NumberGenerator {
	private ArrayList<Observer> observers = new ArrayList<>();
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}
	public abstract int getNumber();
	public abstract void execute();
}

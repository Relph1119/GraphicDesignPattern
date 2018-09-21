package com.gdp.observer.exercise1;

public class IncrementalNumberGenerator extends NumberGenerator {
		
	private int number;
	private int end;
	private int inc;
	
	public IncrementalNumberGenerator(int start, int end, int inc) {
		this.number = start;
		this.end = end;
		this.inc = inc;
	}
	
	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		while(number < end) {
			notifyObservers();
			number += inc;
		}
	}

}

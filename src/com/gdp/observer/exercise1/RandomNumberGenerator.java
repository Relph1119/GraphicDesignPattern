package com.gdp.observer.exercise1;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	private int number;
	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		for(int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}

}

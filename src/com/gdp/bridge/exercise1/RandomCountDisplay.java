package com.gdp.bridge.exercise1;

import java.util.Random;

import com.gdp.bridge.CountDisplay;
import com.gdp.bridge.DisplayImpl;

public class RandomCountDisplay extends CountDisplay {

	private Random random = new Random();
	
	public RandomCountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void randomDisplay(int times) {
		multiDisplay(random.nextInt(times));
	}
}

package com.gdp.strategy.exercise1;

import java.util.Random;

import com.gdp.strategy.Hand;
import com.gdp.strategy.Strategy;

public class RandomStrategy implements Strategy{
	private Random random;
	
	public RandomStrategy(int seed) {
		random = new Random(seed);
	}
	@Override
	public Hand nextHand() {
		return Hand.getHand(random.nextInt(3));
	}

	@Override
	public void study(boolean win) {
		
	}
	
}

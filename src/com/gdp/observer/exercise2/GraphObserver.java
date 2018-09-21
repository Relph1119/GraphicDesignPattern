package com.gdp.observer.exercise2;

public class GraphObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("GraphObserver:");
		int count = generator.getNumber();
		for(int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}

}

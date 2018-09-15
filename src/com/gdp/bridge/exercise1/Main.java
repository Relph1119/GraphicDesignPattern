package com.gdp.bridge.exercise1;

import com.gdp.bridge.StringDisplayImpl;

public class Main {
	public static void main(String[] args) {
		RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, China."));
		d.randomDisplay(10);
	}
}

package com.gdp.bridge.exercise2;

import com.gdp.bridge.CountDisplay;

public class Main {
	public static void main(String[] args) {
		CountDisplay d = new CountDisplay(new FileDisplayImpl("static/Star.txt"));
		d.multiDisplay(3);
	}
}

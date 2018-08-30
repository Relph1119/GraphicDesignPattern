package com.gdp.builder.exercise3;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		FrameBuilder frameBuilder = new FrameBuilder();
		Director director = new Director(frameBuilder);
		director.construct();
		JFrame frame = frameBuilder.getResult();
		frame.setVisible(true);
	}
	
}

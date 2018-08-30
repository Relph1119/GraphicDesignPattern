package com.gdp.builder.exercise1;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString(" ������������ ");
		builder.makeItems(new String[] {
				"���Ϻá�",
				"����á�",
		});
		builder.makeString(" ���� ");
		builder.makeItems(new String[] {
				"���Ϻá�",
				"����",
				"�ټ���",
		});
		builder.close();
	}
}

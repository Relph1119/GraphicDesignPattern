package com.gdp.template_method;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public final void dislay() {
		open();
		for (int i = 0; i< 5; i++) {
			print();
		}
		close();
	}
}

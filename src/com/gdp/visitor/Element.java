package com.gdp.visitor;

public interface Element {
	public abstract void accept(Visitor visitor);
}

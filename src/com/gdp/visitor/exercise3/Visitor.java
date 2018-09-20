package com.gdp.visitor.exercise3;

public abstract class Visitor {
	public abstract void visit(File file);
	public abstract void visit(Directory directory);
}

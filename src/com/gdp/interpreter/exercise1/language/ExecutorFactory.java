package com.gdp.interpreter.exercise1.language;

public interface ExecutorFactory {
	public abstract Executor createExecutor(String name);
}

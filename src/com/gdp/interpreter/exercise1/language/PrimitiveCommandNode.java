package com.gdp.interpreter.exercise1.language;

public class PrimitiveCommandNode extends Node {
	private String name;
	private Executor executor;
	@Override
	public void parse(Context context) throws ParseException {
		name = context.currentToken();
		context.skipToken(name);
		executor = context.createExecutor(name);
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public void execute() throws ExecuteException {
		if(executor == null) {
			throw new ExecuteException(name + ": is not defined");
		} else {
			executor.execute();
		}
	}

}

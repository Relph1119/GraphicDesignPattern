package com.gdp.interpreter.exercise1.language;

public class RepeatCommandNode extends Node {
	private int number;
	private Node commandListNode;
	
	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("repeat");
		number = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}

	@Override
	public String toString() {
		return "[repeat " + number + " " + commandListNode + "]";
	}

	@Override
	public void execute() throws ExecuteException {
		for(int i = 0; i < number; i++) {
			commandListNode.execute();
		}
	}
	
	
}

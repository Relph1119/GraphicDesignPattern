package com.gdp.interpreter.exercise1.language;

public class InterpreterFacade implements Executor{
	private ExecutorFactory factory;
	private Context context;
	private Node programNode;
	
	public InterpreterFacade(ExecutorFactory factory) {
		this.factory = factory;
	}
	
	public boolean parse(String text) {
		boolean ok = true;
		this.context = new Context(text);
		this.context.setExecuteFactory(factory);
		this.programNode = new ProgramNode();
		try {
			programNode.parse(context);
			System.out.println(programNode.toString());
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		}
		return ok;
	}
	
	@Override
	public void execute() throws ExecuteException {
		try {
			programNode.execute();
		} catch (ExecuteException e) {
			e.printStackTrace();
		}
	}
	
}

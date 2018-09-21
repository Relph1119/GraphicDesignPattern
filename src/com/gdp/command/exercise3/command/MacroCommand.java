package com.gdp.command.exercise3.command;

import java.util.Stack;

public class MacroCommand implements Command {
	private Stack<Command> commands = new Stack<>();
	
	@Override
	public void execute() {
		for(Command command : commands) {
			command.execute();
		}
	}
	
	public void append(Command cmd) {
		if(cmd != this) {
			commands.push(cmd);
		}
	}
	
	public void undo() {
		if(!commands.empty()) {
			commands.pop();
		}
	}
	
	public void clear() {
		commands.clear();
	}

}

package com.gdp.interpreter.exercise1.language;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandListNode extends Node {
	private ArrayList list = new ArrayList<>();
	
	@Override
	public void parse(Context context) throws ParseException {
		while(true) {
			if(context.currentToken() == null) {
				throw new ParseException("Missing 'end'");
			} else if(context.currentToken().equals("end")) {
				context.skipToken("end");
				break;
			} else {
				Node commandNode = new CommandNode();
				commandNode.parse(context);
				list.add(commandNode);
			}
		}
	}

	@Override
	public String toString() {
		return list.toString();
	}

	@Override
	public void execute() throws ExecuteException {
		Iterator it = list.iterator();
		while(it.hasNext()) {
			((CommandNode)it.next()).execute();
		}
	}
	
	
}

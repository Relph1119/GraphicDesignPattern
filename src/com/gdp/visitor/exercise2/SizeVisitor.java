package com.gdp.visitor.exercise2;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
	private int size = 0;
	public int getSize() {
		return size;
	}
	
	@Override
	public void visit(File file) {
		size += file.getSize();
	}

	@Override
	public void visit(Directory directory) {
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = it.next();
			entry.accept(this);
		}
	}

}

package com.gdp.visitor.exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
	
	private String fileType;
	private ArrayList<Entry> found = new ArrayList<>();
	
	public FileFindVisitor(String fileType) {
		this.fileType = fileType;
	}

	public Iterator<Entry> getFoundFiles() {
		return found.iterator();
	}
	
	@Override
	public void visit(File file) {
		if(file.getName().endsWith(fileType)) {
			found.add(file);
		}
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

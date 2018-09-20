package com.gdp.visitor.exercise1;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.EncryptedKeyResolver;

public class FileFindVisitor extends Visitor {
	
	private String fileType;
	private ArrayList found = new ArrayList();
	
	public FileFindVisitor(String fileType) {
		this.fileType = fileType;
	}

	public Iterator getFoundFiles() {
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
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}
	}

}

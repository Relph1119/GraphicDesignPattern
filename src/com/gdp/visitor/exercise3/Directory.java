package com.gdp.visitor.exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
	private String name;
	private ArrayList<Entry> directory = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = it.next();
			size += entry.getSize();
		}
		return size;
	}

	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}
	
	public Iterator<Entry> iterator() {
		return directory.iterator();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}

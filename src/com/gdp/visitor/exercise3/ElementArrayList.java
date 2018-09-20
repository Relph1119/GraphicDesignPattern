package com.gdp.visitor.exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList<Element> implements Element {
	private static final long serialVersionUID = 1L;

	@Override
	public void accept(Visitor visitor) {
		Iterator<Element> it = iterator();
		while(it.hasNext()) {
			Element e = it.next();
			e.accept(visitor);
		}
	}

}

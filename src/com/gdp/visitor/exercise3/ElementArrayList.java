package com.gdp.visitor.exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {

	@Override
	public void accept(Visitor visitor) {
		Iterator it = iterator();
		while(it.hasNext()) {
			Element e = (Element) it.next();
			e.accept(visitor);
		}
	}

}

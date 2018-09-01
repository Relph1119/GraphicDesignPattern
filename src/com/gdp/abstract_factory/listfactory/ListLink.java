package com.gdp.abstract_factory.listfactory;

import com.gdp.abstract_factory.factory.Link;

public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}
	
	@Override
	public String makeHTML() {
		return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}

package com.gdp.abstract_factory.listfactory;

import com.gdp.abstract_factory.factory.Factory;
import com.gdp.abstract_factory.factory.Link;
import com.gdp.abstract_factory.factory.Page;
import com.gdp.abstract_factory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
	
}

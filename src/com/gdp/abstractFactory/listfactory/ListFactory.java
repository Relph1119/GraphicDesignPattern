package com.gdp.abstractFactory.listfactory;

import com.gdp.abstractFactory.factory.Factory;
import com.gdp.abstractFactory.factory.Link;
import com.gdp.abstractFactory.factory.Page;
import com.gdp.abstractFactory.factory.Tray;

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

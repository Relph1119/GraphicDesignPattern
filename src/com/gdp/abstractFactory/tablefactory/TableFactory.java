package com.gdp.abstractFactory.tablefactory;

import com.gdp.abstractFactory.factory.Factory;
import com.gdp.abstractFactory.factory.Link;
import com.gdp.abstractFactory.factory.Page;
import com.gdp.abstractFactory.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}

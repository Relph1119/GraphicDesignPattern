package com.gdp.abstract_factory.factory;

public abstract class Link extends Item {
	protected String url;
	
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
		// TODO Auto-generated constructor stub
	}

}

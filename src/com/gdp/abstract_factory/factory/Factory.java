package com.gdp.abstract_factory.factory;

public abstract class Factory {
	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(className).newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("û���ҵ� " + className + " �ࡣ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}

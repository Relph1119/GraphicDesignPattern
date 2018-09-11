package com.gdp.abstractFactory;

import java.util.Arrays;

import com.gdp.abstractFactory.factory.Factory;
import com.gdp.abstractFactory.factory.Link;
import com.gdp.abstractFactory.factory.Page;
import com.gdp.abstractFactory.factory.Tray;

public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main com.gdp.abstractFactory.listfactory.ListFactory");
			System.out.println("Example 2: java Main com.gdp.abstractFactory.tablefactory.TableFactory");
			System.out.println("Example 3: java Main yahoo");
			System.exit(0);
		}
		System.out.println("输入参数为：" + Arrays.asList(args).toString());
		Factory factory = Factory.getFactory(args[0]);
		if(secondParamterEqualsYahoo(args)) {
			createPageOnlyYahoo(factory);
		} else {
			createPage(factory);
		}
	}

	public static boolean secondParamterEqualsYahoo(String[] args) {
		return "yahoo".equals(args[1]);
	}

	public static void createPageOnlyYahoo(Factory factory) {
		Page page = factory.createYahooPage();
		page.output();
	}

	public static void createPage(Factory factory) {
		Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
		Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("日报");
		traynews.add(people);
		traynews.add(gmw);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("检索引擎");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "杨文轩");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
	
}

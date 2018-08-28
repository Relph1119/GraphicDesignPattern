package com.gdp.factory_method.exercise;

import com.gdp.factory_method.framework.Factory;
import com.gdp.factory_method.framework.Product;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("小明");
		Product card2 = factory.create("小红");
		Product card3 = factory.create("小刚");
		card1.use();
		card2.use();
		card3.use();
	}
}

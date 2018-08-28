package com.gdp.factory_method.exercise;

import java.util.HashMap;
import java.util.Hashtable;

import com.gdp.factory_method.framework.Factory;
import com.gdp.factory_method.framework.Product;

public class IDCardFactory extends Factory {
	private HashMap database = new HashMap<>();
	private int serial = 100;
	
	
	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		IDCard card = (IDCard)product;
		database.put(new Integer(card.getSerial()), card.getOwner());
	}

	public HashMap getDatabase() {
		return database;
	}
	
}

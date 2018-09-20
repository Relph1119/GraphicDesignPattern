package com.gdp.factoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.gdp.factoryMethod.framework.Factory;
import com.gdp.factoryMethod.framework.Product;

public class IDCardFactory extends Factory {
	
	private List<String> owners = new ArrayList<>();
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}
	
}

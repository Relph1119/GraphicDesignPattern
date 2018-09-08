package com.gdp.factoryMethod.exercise2;

import com.gdp.factoryMethod.framework.Product;

public class IDCard extends Product {
	
	private String owner;
	private int serial;
	
	IDCard(String owner, int serial) {
		System.out.println("制作" + owner + "(" + serial + ")" + "的ID卡。");
		this.owner = owner;
		this.serial = serial;
	}

	@Override
	public void use() {
		System.out.println("使用" + owner + "(" + serial + ")" + "的ID卡。");
	}

	public String getOwner() {
		return owner;
	}
	
	public int getSerial() {
		return serial;
	}
}

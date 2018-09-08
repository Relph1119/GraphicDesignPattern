package com.gdp.factoryMethod.exercise2;

import com.gdp.factoryMethod.framework.Product;

public class IDCard extends Product {
	
	private String owner;
	private int serial;
	
	IDCard(String owner, int serial) {
		System.out.println("����" + owner + "(" + serial + ")" + "��ID����");
		this.owner = owner;
		this.serial = serial;
	}

	@Override
	public void use() {
		System.out.println("ʹ��" + owner + "(" + serial + ")" + "��ID����");
	}

	public String getOwner() {
		return owner;
	}
	
	public int getSerial() {
		return serial;
	}
}

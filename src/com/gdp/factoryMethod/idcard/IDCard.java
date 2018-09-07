package com.gdp.factoryMethod.idcard;

import com.gdp.factoryMethod.framework.Product;

public class IDCard extends Product {
	
	private String owner;
	
	IDCard(String owner) {
		System.out.println("����" + owner + "��ID����");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("ʹ��" + owner + "��ID����");
	}

	public String getOwner() {
		return owner;
	}

}

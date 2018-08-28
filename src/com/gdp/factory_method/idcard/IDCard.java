package com.gdp.factory_method.idcard;

import com.gdp.factory_method.framework.Product;

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

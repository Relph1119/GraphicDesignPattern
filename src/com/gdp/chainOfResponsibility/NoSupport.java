package com.gdp.chainOfResponsibility;

public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}

}

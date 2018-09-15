package com.gdp.strategy;

public class Hand {
	public static final int HANDVALUE_GUO = 0;
	public static final int HANDVALUE_CHO = 1;
	public static final int HANDVALUE_PAA = 2;
	public static final Hand[] hand = {
			new Hand(HANDVALUE_GUO),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA)
	};
	
	private static final String[] name = {
			"Ê¯Í·","¼ôµ¶","²¼"
	};
	
	private int handvalue;
	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}
	
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}
	
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if((this.handvalue + 1) % 3 == h.handvalue) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return name[handvalue];
	}
	
}

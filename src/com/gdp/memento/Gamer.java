package com.gdp.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class Gamer {
	private int money;
	private List<String> fruits = new ArrayList<>();
	private Random random = new Random();
	private static String[] fruitsName = {
		"ƻ��", "����", "�㽶", "����",
	};
	
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void bet() {
		int dice = random.nextInt(6) + 1;
		if(dice == 1) {
			money += 100;
			System.out.println("���ֽ�Ǯ�����ˡ�");
		} else if(dice == 2) {
			money /= 2;
			System.out.println("���ֽ�Ǯ�����ˡ�");
		} else if(dice == 6) {
			String f = getFruit();
			System.out.println("�����ˮ��(" + f + ")");
			fruits.add(f);
		} else {
			System.out.println("ʲô��û�з�����");
		}
	}
	
	public Memento createMemento() {
		Memento m = new Memento(money);
		for(String f : fruits) {
			if(f.startsWith("�óԵ�")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	
	public void restoreMemento(Memento memento) {
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}
	
	public String toString() {
		return "[money = " + money + ", fruits = "+ fruits + "]";
	}
	
	private String getFruit() {
		String prefix = "";
		if(random.nextBoolean()) {
			prefix = "�óԵ�";
		}
		return prefix + fruitsName[random.nextInt(fruitsName.length)];
	}
	
}

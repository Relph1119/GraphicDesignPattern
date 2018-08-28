package com.gdp.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("����һ��ʵ����");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}

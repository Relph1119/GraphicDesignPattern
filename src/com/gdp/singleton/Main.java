package com.gdp.singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1��obj2����ͬ��ʵ����");
		}else {
			System.out.println("obj1��obj2�ǲ�ͬ��ʵ����");
		}
		System.out.println("End.");
		
	}
}

package com.gdp.flyweight.exercise2;

public class Main {
	private static BigString[] bsArray = new BigString[1000];
	
	public static void main(String[] args) {
		System.out.println("����ʱ��");
		testAllocation(true);
		System.out.println("�ǹ���ʱ��");
		testAllocation(false);
	}
	
	public static void testAllocation(boolean shared) {
		for(int i = 0; i < bsArray.length; i++) {
			bsArray[i] = new BigString("1212123", shared);
		}
		showMemory();
	}
	
	public static void showMemory() {
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("ʹ���ڴ� = " + used);
	}

}

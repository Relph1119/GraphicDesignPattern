package com.gdp.templateMethod;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("��ã� ���硣");
		d1.display();
		d2.display();
		d3.display();
	}
}

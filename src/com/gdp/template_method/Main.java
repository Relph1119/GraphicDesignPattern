package com.gdp.template_method;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("ÄãºÃ£¬ ÊÀ½ç¡£");
		d1.dislay();
		d2.dislay();
		d3.dislay();
	}
}

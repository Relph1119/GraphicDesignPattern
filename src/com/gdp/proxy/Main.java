package com.gdp.proxy;

public class Main {

	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice");
		System.out.println("���ڵ�������" + p.getPrinterName() + "��");
		p.setPrinterName("Bob");
		System.out.println("���ڵ�������" + p.getPrinterName() + "��");
		p.print("Hello, world.");
	}

}

package com.gdp.proxy.exercise1;

public class PrinterProxy implements Printable {
	private String name;
	private Printable real;
	private String className;
	public PrinterProxy() {}
	public PrinterProxy(String name, String className) {
		this.name = name;
		this.className = className;
	}
	
	@Override
	public synchronized void setPrinterName(String name) {
		if(real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	private synchronized void realize() {
		if(real == null) {
			try {
				real = (Printable) Class.forName(className).newInstance();
				real.setPrinterName(name);
			} catch (ClassNotFoundException e) {
				System.err.println("没有找到 " + className + "类。");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
}

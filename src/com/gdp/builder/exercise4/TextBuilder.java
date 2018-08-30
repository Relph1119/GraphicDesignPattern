package com.gdp.builder.exercise4;

public class TextBuilder extends Builder {
	
	private String buffer = "";
	
	@Override
	public void makeTitle(String title) {
		buffer += "=============================\n";
		buffer += " [ " + title +" ]\n";
		buffer += "\n";
	}

	@Override
	public void makeString(String str) {
		buffer += '¡ö' + str + "\n";
		buffer += "\n";
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer += "  ¡¤" + items[i] + "\n";
		}
		buffer += "\n";
	}

	@Override
	public void close() {
		buffer += "=============================\n";
	}

	public String getResult() {
		return buffer.toString();
	}
}

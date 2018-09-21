package com.gdp.flyweight.exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
	private char charName;
	private String fontData;
	
	public BigChar(char charName) {
		this.charName = charName;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("static/"+ "big" + charName + ".txt"));
			String line;
			StringBuffer buf = new StringBuffer();
			while((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontData = buf.toString();
		} catch (IOException e) {
			this.fontData = charName + "?";
		}
	}
	
	public void print() {
		System.out.print(fontData);
	}
}

package com.gdp.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
	private Database() {}
	public static Properties getProperties(String dbName) {
		String fileName = dbName + ".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("static/" + fileName));
		} catch (IOException e) {
			System.out.println("Warning: " + fileName + " is not found.");
		}
		return prop;
	}
}

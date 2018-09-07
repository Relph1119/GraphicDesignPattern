package com.gdp.adapter.exercise2;

public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		String filePath = Main.class.getResource("file.txt").getPath();
		String newFilePath = Main.class.getResource("").getPath() + "newfile.txt";
		try {
			f.readFromFile(filePath);
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile(newFilePath);
			f.printFromFile(newFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

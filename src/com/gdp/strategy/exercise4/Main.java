package com.gdp.strategy.exercise4;

public class Main {

	public static void main(String[] args) {
		Comparable<String>[] data = new String[] {
			"Dumpty", "Bowman", "Carroll", "Elfland", "Alice",	
		};
		SortAndPrint sap = new SortAndPrint(data, new QuickSorter());
		sap.execute();
	}

}

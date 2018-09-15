package com.gdp.strategy.exercise4;

public class SelectionSorter implements Sorter {

	@Override
	public void sort(Comparable[] data) {
		for(int i = 0; i < data.length-1; i++) {
			int min = i;
			for(int j = i+1; j < data.length; j++) {
				if(data[min].compareTo(data[j]) > 0) {
					min = j;
				}
			}
			Comparable passingplace = data[min];
			data[min] = data[i];
			data[i] = passingplace;
		}
	}

}

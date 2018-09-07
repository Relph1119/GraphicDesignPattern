package com.gdp.adapter.exercise2;

import java.io.IOException;

public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws Exception;
	public void setValue(String key, String value);
	public String getValue(String key);
	public void printFromFile(String newFilePath);
}

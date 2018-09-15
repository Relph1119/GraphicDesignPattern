package com.gdp.bridge.exercise2;

import java.io.BufferedReader;
import java.io.FileReader;

import com.gdp.bridge.DisplayImpl;

public class FileDisplayImpl extends DisplayImpl {
	
	private String fileName;
	private BufferedReader reader;
	private final int MAX_READAHEAD_LIMIT = 4096;
	public FileDisplayImpl(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void rawOpen() {
		try {
			reader = new BufferedReader(new FileReader(fileName));
			reader.mark(MAX_READAHEAD_LIMIT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=-=-=-=-=-= " + fileName + " =-=-=-=-=-=");
	}

	@Override
	public void rawPrint() {
		try {
			String line;
			reader.reset();
			while((line = reader.readLine()) != null) {
				System.out.println("> " + line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		System.out.println("=-=-=-=-=-= ");
		try {
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

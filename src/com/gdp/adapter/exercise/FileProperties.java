package com.gdp.adapter.exercise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	@Override
	public void readFromFile(String filename) throws IOException {
		InputStream in = FileProperties.class.getResourceAsStream(filename);
		load(in);
	}

	@Override
	public void writeToFile(String filename) throws Exception{
		URL fileUrl = FileProperties.class.getResource(filename);
		FileOutputStream fos = new FileOutputStream(new File(fileUrl.toURI()));
		store(fos, "written by FileProperties");
        fos.close();
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key, "");
	}

}

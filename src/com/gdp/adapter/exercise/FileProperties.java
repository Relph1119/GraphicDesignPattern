package com.gdp.adapter.exercise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class FileProperties implements FileIO {

	private static Properties p = new Properties();
	
	@Override
	public void readFromFile(String filename) throws IOException {
		InputStream in = FileProperties.class.getResourceAsStream(filename);
		p.load(in);
		in.close();
	}

	@Override
	public void writeToFile(String filename) throws Exception{
		URL fileUrl = FileProperties.class.getResource(filename);
		FileOutputStream fos = new FileOutputStream(new File(fileUrl.toURI()));
		p.store(fos, "written by FileProperties");
        fos.close();
	}

	@Override
	public void setValue(String key, String value) {
		p.put(key, value);
	}

	@Override
	public String getValue(String key) {
		return p.getProperty(key);
	}

}

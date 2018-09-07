package com.gdp.adapter.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	private static final long serialVersionUID = 459713410167826483L;

	@Override
	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws Exception{
		File file = new File(filename);
		if(!file.exists()) {
			file.createNewFile();
		}
		store(new FileOutputStream(filename), "written by FileProperties");
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key, "");
	}

	@Override
	public void printFromFile(String newFilePath) {
		StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(newFilePath));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(result.toString());
	}

}

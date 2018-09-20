package com.gdp.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class PageMaker {
	
	private PageMaker() {}
	public static void makeWelcomePage(String mailAddr, String fileName) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String userName = mailprop.getProperty(mailAddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			writer.title("Welcome to " + userName + "'s page!");
			writer.paragraph(userName + "��ӭ����" + userName + " ����ҳ��");
			writer.paragraph(" ��ǰ����ʱ�䣺" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			writer.paragraph(" ��������ʼ�Ŷ�� ");
			writer.mailto(mailAddr, userName);
			writer.close();
			System.out.println(fileName + " is created for " + mailAddr + " ( " + userName + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

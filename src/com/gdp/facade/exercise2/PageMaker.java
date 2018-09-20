package com.gdp.facade.exercise2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map.Entry;
import java.util.Properties;

public class PageMaker {
	
	private PageMaker() {}
	public static void makeWelcomePage(String mailAddr, String fileName) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String userName = mailprop.getProperty(mailAddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			writer.title("Welcome to " + userName + "'s page!");
			writer.paragraph(userName + "欢迎来到" + userName + " 的主页。");
			writer.paragraph(" 当前创建时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			writer.paragraph(" 等着你的邮件哦！ ");
			writer.mailto(mailAddr, userName);
			writer.close();
			System.out.println(fileName + " is created for " + mailAddr + " ( " + userName + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void makeLinkPage(String fileName) {
		try {
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			writer.title("Link Page");
			writer.paragraph(" 当前创建时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			Properties mailprop = Database.getProperties("maildata");
			for(Entry<Object, Object> entry : mailprop.entrySet()) {
				String mailAddr = (String) entry.getKey();
				String userName = (String) entry.getValue();
				writer.mailto(mailAddr, userName);
			}
			writer.close();
			System.out.println(fileName + " is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

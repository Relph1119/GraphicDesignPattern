package com.gdp.builder.exercise2;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBulider htmlBulider = new HTMLBulider();
			Director director = new Director(htmlBulider);
			director.construct();
			String filename = htmlBulider.getResult();
			System.out.println(filename + "�ļ���д��ɡ�");
		} else {
			usage();
			System.exit(0);
		}
	}
	
	public static void usage() {
		System.out.println("Usage: java Main plain   ��д���ı��ĵ� ");
		System.out.println("Usage: java Main html    ��дHTML�ĵ� ");
	}
}

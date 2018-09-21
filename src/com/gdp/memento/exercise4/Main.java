package com.gdp.memento.exercise4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Main {
	
	public static final String SAVEFILE_NAME = "game.dat";
	
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = loadMemento();
		if(memento != null) {
			System.out.println("读取上次保存存档开始游戏。");
			gamer.restoreMemento(memento);
		} else {
			System.out.println("新游戏。");
			memento = gamer.createMemento();
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println(" 当前状态：" + gamer);
			
			gamer.bet();
			System.out.println("所持金钱为 " + gamer.getMoney() + " 元。");
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("    (所持金钱增加了许多，因此保存游戏当前的状态)");
				memento = gamer.createMemento();
				saveMemento(memento);
			} else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("    (所持金钱减少了许多，因此将游戏恢复至以前的状态)");
				gamer.restoreMemento(memento);
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}
	
	public static void saveMemento(Memento memento) {
		try {
			ObjectOutput out = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(SAVEFILE_NAME)));
			out.writeObject(memento);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Memento loadMemento() {
		Memento memento = null;
		try {
			ObjectInput in = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVEFILE_NAME)));
			memento = (Memento) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return memento;
	}

}

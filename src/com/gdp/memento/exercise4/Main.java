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
			System.out.println("��ȡ�ϴα���浵��ʼ��Ϸ��");
			gamer.restoreMemento(memento);
		} else {
			System.out.println("����Ϸ��");
			memento = gamer.createMemento();
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println(" ��ǰ״̬��" + gamer);
			
			gamer.bet();
			System.out.println("���ֽ�ǮΪ " + gamer.getMoney() + " Ԫ��");
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("    (���ֽ�Ǯ��������࣬��˱�����Ϸ��ǰ��״̬)");
				memento = gamer.createMemento();
				saveMemento(memento);
			} else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("    (���ֽ�Ǯ��������࣬��˽���Ϸ�ָ�����ǰ��״̬)");
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

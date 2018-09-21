package com.gdp.memento;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		for(int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println(" ��ǰ״̬��" + gamer);
			
			gamer.bet();
			System.out.println("���ֽ�ǮΪ " + gamer.getMoney() + " Ԫ��");
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("    (���ֽ�Ǯ��������࣬��˱�����Ϸ��ǰ��״̬)");
				memento = gamer.createMemento();
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

}

package com.gdp.observer.exercise2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameObserver extends Frame implements Observer, ActionListener {
	
	private GraphText textGraph = new GraphText(60);
	private GraphCanvas canvasGraph = new GraphCanvas();
	private Button buttonClose = new Button("Close");
	
	public FrameObserver() {
		super("FrameObserver");
		setLayout(new BorderLayout());
		setBackground(Color.lightGray);
		textGraph.setEditable(false);
		canvasGraph.setSize(500, 500);
		add(textGraph, BorderLayout.NORTH);
		add(canvasGraph, BorderLayout.CENTER);
		add(buttonClose, BorderLayout.SOUTH);
		buttonClose.addActionListener(this);
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		System.exit(0);
	}

	@Override
	public void update(NumberGenerator generator) {
		textGraph.update(generator);
		canvasGraph.update(generator);
	}

}

class GraphText extends TextField implements Observer {
	public GraphText(int columns) {
		super(columns);
	}
	
	@Override
	public void update(NumberGenerator generator) {
		int number = generator.getNumber();
		String text = number + ":";
		for (int i = 0; i < number; i++) {
			text += "*";
		}
		setText(text);
	}
}

class GraphCanvas extends Canvas implements Observer {
	private int number;

	@Override
	public void update(NumberGenerator generator) {
		number = generator.getNumber();
		repaint();
	}
	
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.white);
		g.fillArc(0, 0, width, height, 0, 360);
		g.setColor(Color.red);
		g.fillArc(0, 0, width, height, 90, - number * 360 / 50);
	}
}

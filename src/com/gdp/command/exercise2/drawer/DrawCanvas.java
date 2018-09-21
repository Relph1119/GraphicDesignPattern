package com.gdp.command.exercise2.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import com.gdp.command.exercise2.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {
	private Color color = Color.RED;
	private int radius = 6;
	private MacroCommand history;
	
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.WHITE);
		this.history = history;
	}
	
	public void paint(Graphics g) {
		history.execute();
	}
	
	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}

}

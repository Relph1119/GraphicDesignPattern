package com.gdp.command.exercise3.command;

import java.awt.Point;

import com.gdp.command.exercise3.drawer.Drawable;

public class DrawCommand implements Command{
	private Drawable drawable;
	private Point position;
	
	public DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}

	@Override
	public void execute() {
		drawable.draw(position.x, position.y);
	}
	
}

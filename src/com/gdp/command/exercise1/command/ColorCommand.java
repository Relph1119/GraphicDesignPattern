package com.gdp.command.exercise1.command;

import java.awt.Color;

import com.gdp.command.exercise1.drawer.Drawable;

public class ColorCommand implements Command {
	
	protected Drawable drawable;
	private Color color;
	
	public ColorCommand(Drawable drawable, Color color) {
		this.drawable = drawable;
		this.color = color;
	}

	@Override
	public void execute() {
		drawable.setColor(color);
	}

}

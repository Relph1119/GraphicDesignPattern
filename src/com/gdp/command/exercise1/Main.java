package com.gdp.command.exercise1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.gdp.command.exercise1.command.ColorCommand;
import com.gdp.command.exercise1.command.Command;
import com.gdp.command.exercise1.command.DrawCommand;
import com.gdp.command.exercise1.command.MacroCommand;
import com.gdp.command.exercise1.drawer.DrawCanvas;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener{
	private MacroCommand history = new MacroCommand();
	
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	private JButton redButton = new JButton("red");
	private JButton greenButton = new JButton("green");
	private JButton blueButton = new JButton("blue");

	public Main(String title) {
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(redButton);
		buttonBox.add(greenButton);
		buttonBox.add(blueButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		setVisible(true);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		saveCommandAndExecute(cmd);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearButton) {
			history.clear();
			canvas.init();
			canvas.repaint();
		} else if(e.getSource() == redButton) {
			Command cmd = new ColorCommand(canvas, Color.RED);
			saveCommandAndExecute(cmd);
		} else if(e.getSource() == greenButton) {
			Command cmd = new ColorCommand(canvas, Color.GREEN);
			saveCommandAndExecute(cmd);
		} else if(e.getSource() == blueButton) {
			Command cmd = new ColorCommand(canvas, Color.BLUE);
			saveCommandAndExecute(cmd);
		}
	}

	public void saveCommandAndExecute(Command cmd) {
		history.append(cmd);
		cmd.execute();
	}
	
	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}

}

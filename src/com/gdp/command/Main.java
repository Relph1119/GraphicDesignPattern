package com.gdp.command;

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

import com.gdp.command.command.Command;
import com.gdp.command.command.DrawCommand;
import com.gdp.command.command.MacroCommand;
import com.gdp.command.drawer.DrawCanvas;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener{
	private MacroCommand history = new MacroCommand();
	
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");

	public Main(String title) {
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
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
		history.append(cmd);
		cmd.execute();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearButton) {
			history.clear();
			canvas.repaint();
		}
		
	}
	
	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}

}

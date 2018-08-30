package com.gdp.builder.exercise3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameBuilder extends Builder implements ActionListener {
	
	private JFrame frame = new JFrame();
	private Box box = new Box(BoxLayout.Y_AXIS);
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}

	@Override
	public void makeTitle(String title) {
		frame.setTitle(title);
	}

	@Override
	public void makeString(String str) {
		box.add(new JLabel(str));
	}

	@Override
	public void makeItems(String[] items) {
		Box innerbox = new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < items.length; i++) {
			JButton button = new JButton(items[i]);
			button.addActionListener(this);
			innerbox.add(button);
		}
		box.add(innerbox);
	}

	@Override
	public void close() {
		frame.getContentPane().add(box);
		frame.pack();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public JFrame getResult() {
		return frame;
	}

}

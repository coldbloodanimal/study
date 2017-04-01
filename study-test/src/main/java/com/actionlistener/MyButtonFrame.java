package com.actionlistener;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyButtonFrame extends JFrame{
	private JPanel buttonPanel;
	public static final int DEFAULT_WIDTH=500;
	public static final int DEFAULT_HEIGTH=300;
	
	public MyButtonFrame() throws HeadlessException {
		super();
		setTitle("Button");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		JButton green=new JButton("green");
		JButton red=new JButton("red");
		JButton blue=new JButton("blue");
		
		buttonPanel=new JPanel();
		buttonPanel.setBackground(Color.PINK);
		buttonPanel.add(green);
		buttonPanel.add(red);
		buttonPanel.add(blue);
		this.add(buttonPanel);
		green.addActionListener(new ColorAction(buttonPanel, Color.GREEN));
		red.addActionListener(new ColorAction(buttonPanel, Color.RED));
		blue.addActionListener(new ColorAction(buttonPanel, Color.BLUE));
	}
}

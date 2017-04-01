package com.actionlistener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorAction implements ActionListener{
	private JPanel jpanel;
	private Color c;


	public ColorAction(JPanel buttonPanel, Color c) {
		super();
		this.jpanel = buttonPanel;
		this.c = c;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jpanel.setBackground(this.c);
		
	}

}

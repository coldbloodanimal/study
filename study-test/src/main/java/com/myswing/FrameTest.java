package com.myswing;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.*;
public class FrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JFrame frame=new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLocationByPlatform(true);
//		frame.setSize(300,200);
//		frame.setVisible(true);
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				SizedFrame frame=new SizedFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				JLabel label=new JLabel();
				label.setText("nihaoa !");
				Component c=new MyComponent();
				
				Container container=frame.getContentPane();
				
				container.add(label);
				container.add(c);
				
			}
		});
	}

}

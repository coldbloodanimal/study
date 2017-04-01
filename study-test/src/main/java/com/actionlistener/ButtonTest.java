package com.actionlistener;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.myswing.MyComponent;
import com.myswing.SizedFrame;

public class ButtonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedLookAndFeelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				SizedFrame frame=new SizedFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				Container container=frame.getContentPane();
				JPanel jp=new JPanel();
				JButton yellow=new JButton("yellow");
				JButton red=new JButton("red");
				JButton blue=new JButton("blue");
				
				jp.add(yellow);
				jp.add(red);
				jp.add(blue);
				
				frame.add(jp);
//				container.add(yellow);
//				container.add(red);
//				container.add(blue);
				
				
			}
		});
	}

}

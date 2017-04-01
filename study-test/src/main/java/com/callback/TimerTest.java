package com.callback;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener al=new TimeShower();
		Timer t=new Timer(5000, al);
		t.start();
		JOptionPane.showMessageDialog(null, "quit program?");
		System.exit(0);
	}
	

}

package com.callback;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class TimeShower implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date date=new Date();
		System.out.println("now is "+date);
		
		
	}
	


}

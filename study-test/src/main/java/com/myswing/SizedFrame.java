package com.myswing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.*;

import javax.swing.JFrame;

public class SizedFrame extends JFrame{
	public SizedFrame(){
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		double screenHight=screenSize.getHeight();
		double screenWidth=screenSize.getWidth();
		
		setSize((int)screenWidth/2,(int)screenHight/2);
		//setSize(300,200);
		setLocationByPlatform(true);
		Image img=kit.getImage("icon.gif");
		setIconImage(img);
		setTitle("SizedFramee");
		
	}

		

}

package com.thread;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.ArrayList;

import com.thread.Ball;
import javax.swing.JPanel;

public class BallComponent extends JPanel{
	private ArrayList<Ball> balls=new ArrayList<Ball>();
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		for (Ball b:balls){
			g2.fill((Shape) b);
		}
	}
	public void add(Ball b){
	
		balls.add(b);
	}

}

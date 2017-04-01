package com.thread;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ball {
	private static final int XSIZE=15;
	private static final int YSIZE=15;
	private double x=0;
	private double y=0;
	private double dx=1;
	private double dy=1;
	
	public Ellipse2D getShape(){
		return new Ellipse2D.Double(x,y,XSIZE,YSIZE);
	}
	
	public void move(Rectangle2D bounds){
		x+=dx;
		y+=dy;
		if(x<bounds.getMinX()){
		
		}
	}
	
}

package com.myswing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class MyComponent extends JComponent{
	private Image image;
	public MyComponent() {
		super();
		try {
			image=ImageIO.read(new File("C:\\Users\\badboy\\Pictures\\a.jpg"));
			//image=new Image(new URL("http://a.hiphotos.baidu.com/image/pic/item/aa18972bd40735fac6f8bbb49c510fb30f2408b6.jpg"),"CD corver");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void paintComponent(Graphics g){
		g.drawString("你好", 200, 300);
		Graphics2D g2=(Graphics2D)g;
		double leftX=100;
		double topY=100;
		double width=200;
		double height=500;
		//画图形
		Rectangle2D rectangle2d=new Rectangle2D.Double(leftX,topY,width,height);
		
		Ellipse2D ellipse=new Ellipse2D.Double();
		ellipse.setFrame(rectangle2d);
		System.out.println("maxx"+rectangle2d.getMaxX());
		System.out.println("minx"+rectangle2d.getMinX());
		System.out.println("maxY"+rectangle2d.getMaxY());
		System.out.println("miny"+rectangle2d.getMinY());
		g2.draw(rectangle2d);
		g2.draw(ellipse);
		g2.setPaint(Color.RED);
		g2.setColor(Color.GREEN);
		g2.fill(ellipse);
		this.setBackground(Color.PINK);
		//图形显示
//		if(image == null) return;
//		int width=image.getWidth(this);
//		int height=image.getHeight(this);
//		
//		g.drawImage(image, 0, 0, null);
//		
//		for (int i=0;i*width<=getWidth();i++){
//			for(int j=0;j*height<=getHeight();j++){
//				System.out.println("i -> "+i+"j -> "+j);
//				if(i+j>0) g.copyArea(0, 0, width, height, i*width, j*height);
//			}
//		}
		
	}

}

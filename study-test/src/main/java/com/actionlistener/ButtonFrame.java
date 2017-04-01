package com.actionlistener;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ButtonFrame extends JFrame{
	private JPanel buttonPanel;
	public static final int DEFAULT_WIDTH=300;
	public static final int DEFAULT_HEIGTH=200;
	

	public ButtonFrame() throws HeadlessException {
		//super();
		setTitle("Button");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		JButton yellow=new JButton("yellow");
		JButton red=new JButton("red");
		JButton blue=new JButton("blue");
		
		buttonPanel=new JPanel();
		buttonPanel.setBackground(Color.PINK);
		buttonPanel.add(yellow);
		buttonPanel.add(red);
		buttonPanel.add(blue);
		this.add(buttonPanel);
		Action yellowKey=new ColorActionKey("yellowkey",new ImageIcon("yellow-ball.gif"),Color.yellow);
		Action redKey=new ColorActionKey("redkey",new ImageIcon("red-ball.gif"),Color.red);
		
		yellow.addActionListener(yellowKey);
		yellow.addActionListener(new ColorAction(Color.yellow));
		red.addActionListener(new ColorAction(Color.RED));
		blue.addActionListener(new ColorAction(Color.BLUE));
		
		InputMap imap=buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		imap.put(KeyStroke.getKeyStroke("alt F4"), "yellow");
		// imap.put(KeyStroke.getKeyStroke("ctrl Alt"), "red");
		ActionMap amap=buttonPanel.getActionMap();
		amap.put("yellow",yellowKey);
		amap.put("red",redKey);
		
		UIManager.LookAndFeelInfo[] infos=UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo info:infos){
		makebutton(info.getName(),info.getClassName());
		}
	}
	private class ColorAction implements ActionListener{

		private Color c;
		public ColorAction(Color c) {
			super();
			this.c=c;
			// TODO Auto-generated constructor stub
		}

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buttonPanel.setBackground(c);
			
		}
		
	}
	public class ColorActionKey extends AbstractAction{
		
		public ColorActionKey(String name,Icon icon,Color c){
//			putValue(Action.NAME,name);
//			putValue(Action.SMALL_ICON,icon);
//			putValue("color",c);
//			putValue(Action.SHORT_DESCRIPTION,"set panel color to "+ name.toLowerCase());
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color) getValue("color");
			buttonPanel.setBackground(c);
		}
		
		
	}
	private void makebutton(String plafname,final String plafclass){
		
		JButton button=new JButton(plafname);
		buttonPanel.add(button);
		
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {

					
					UIManager.setLookAndFeel(plafclass);
					SwingUtilities.updateComponentTreeUI(ButtonFrame.this);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
	}

	
	
}

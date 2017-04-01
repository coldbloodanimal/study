package com.actionlistener;

import javax.swing.UIManager;

public class PlafFrameShowTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIManager.LookAndFeelInfo[] infos=UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo info:infos){
		System.out.println("info.getName()"+info.getName()+"  "+"info.getClassName()"+info.getClassName());	
		}
		}

}

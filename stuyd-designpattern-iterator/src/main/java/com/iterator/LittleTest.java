package com.iterator;

import java.util.Hashtable;

public class LittleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CafeMenu menu=new CafeMenu();
		
		for(String a:menu.getMenuitems().keySet()){
			System.out.println(a);
		}
		
		
		
	}

}

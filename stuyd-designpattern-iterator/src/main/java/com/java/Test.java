package com.java;

import java.util.Iterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PancakeHouseMenu p=new PancakeHouseMenu();
		Iterator<MenuItem> i=p.getMenuitems().iterator();
		
		DinerMenu d=new DinerMenu();
		//Iterator<MenuItem> id=d.getMenuItems()
//		while(i.hasNext()){
//			System.out.println(i.next().getName());
//		}
		for(MenuItem pp:d.getMenuItems()){
			if(pp!=null){
			System.out.println(pp.getName());
			}
		}
	}

}

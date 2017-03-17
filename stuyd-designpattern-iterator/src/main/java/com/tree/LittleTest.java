package com.tree;

import java.util.Iterator;
public class LittleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CafeMenu menu=new CafeMenu();
//		
//		for(String a:menu.getMenuitems().keySet()){
//			System.out.println(a);
//		}
		Menu dinermenu=new DinerMenu();
		
		mySuperWaitress(dinermenu);
		
		

		
		
	}
	public static void  mySuperWaitress(Menu menu){
		Iterator<Menu> menuIterator=menu.createIteratorMenu();
		Iterator<MenuItem> menuItemIterator=menu.createIterator();
		//它
		try {
			while(menuItemIterator.hasNext()){
				MenuItem menuitem=menuItemIterator.next();
				if(menuitem!=null){
				System.out.println("name is "+menuitem.getName());
				System.out.println("description is "+menuitem.getDescirption());
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("iterator");
		}
		//它们的爹
		try {
			//DinerMenuIterator<Menu> menuIterator=new DinerMenuIterator<Menu>(dinermenu.getMenus());
			while(menuIterator.hasNext()){ 
				Menu m=menuIterator.next();
				if(m!=null){
					mySuperWaitress(m);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("for");
		}
		
	}

}

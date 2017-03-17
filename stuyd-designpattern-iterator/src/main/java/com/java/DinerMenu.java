package com.java;

import java.util.Iterator;

public class DinerMenu{
	private static final int MAX_ITEMS=6;
	private int numberOfItems=0;
	MenuItem[] menuItems;
	
	
	




	public DinerMenu() {
		super();
		menuItems=new MenuItem[MAX_ITEMS];
		addItem("包子","韭菜鸡蛋",false,2.99);
		addItem("稀饭","八宝粥",true,2.99);
		addItem("面条","蛋炒面",true,3.49);
		addItem("米饭","蛋炒面",true,3.59);
	}



	public void addItem(String name, String description, boolean vegetarian,
			double price) {
			if (numberOfItems<6) {
			
			menuItems[numberOfItems]=new MenuItem(name,description,vegetarian,price);
			numberOfItems++;
			}else{
				System.out.println("Menuitems is full, can't add new item");
				
			}
			
	}
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public MenuItem getMenuItem(int i){
		
		return this.menuItems[i];
		
	}
	public int getLength(){
		
		return this.menuItems.length;
	}


	
}

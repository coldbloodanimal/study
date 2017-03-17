package com.tree;

import java.util.Iterator;

public class DinerMenu implements Menu{
	private static final int MAX_ITEMS=6;
	private static final int MAX_MENUS=3;
	private int numberOfItems=0;
	MenuItem[] menuItems;
	Menu[] menus;

	
	




	public DinerMenu() {
		super();
		menuItems=new MenuItem[MAX_ITEMS];
		menus=new Menu[MAX_MENUS];
		addItem("����1","�²˼���1",false,2.99);
		addItem("ϡ��2","�˱���2",true,2.99);
		addItem("����3","������3",true,3.49);
		addItem("�׷�4","������4",true,3.59);
		menus[0]=new CafeMenu();

	}



	public void addItem(String name, String description, boolean vegetarian,
			double price) {
			if (numberOfItems<MAX_ITEMS) {
			
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
	public Iterator<MenuItem> createIterator(){
		return new DinerMenuIterator<MenuItem>(menuItems);
	}







	@Override
	public Iterator<Menu> createIteratorMenu() {
		// TODO Auto-generated method stub
		return new DinerMenuIterator<Menu>(menus);
	}

	
}

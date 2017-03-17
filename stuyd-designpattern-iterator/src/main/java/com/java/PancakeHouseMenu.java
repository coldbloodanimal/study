package com.java;

import java.util.ArrayList;

public class PancakeHouseMenu {
	
	private ArrayList<MenuItem> menuitems;
	
public PancakeHouseMenu() {
		super();
		menuitems=new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,2.99);
		addItem("Regular Pancake Breakfast","Pancakes with fried eggs,sausage",true,2.99);
		addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49);
		addItem("Waffles","waffles,with your choice of blueberries or strawberries",false,3.59);
	}




public void addItem(String name, String description, boolean vegetarian,
		double price) {
		MenuItem item=new MenuItem(name,description,vegetarian,price);
		menuitems.add(item);
}

public ArrayList<MenuItem> getMenuitems() {
	return menuitems;
}
public MenuItem getMenuItem(int i){
	
	return this.menuitems.get(i);
	
}

public int getLength(){
	
	return this.menuitems.size();
}

}

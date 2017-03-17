package com.tree;

import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenu implements Menu{
	
	private ArrayList<MenuItem> menuitems;
	private ArrayList<Menu> menus;
	
public PancakeHouseMenu() {
		super();
		menuitems=new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfast h1","Pancakes with scrambled eggs, and toast",true,2.99);
		addItem("Regular Pancake Breakfast h2","Pancakes with fried eggs,sausage",true,2.99);
		addItem("Blueberry Pancakes h3","Pancakes made with fresh blueberries",true,3.49);
		addItem("Waffles h4","waffles,with your choice of blueberries or strawberries",false,3.59);
		menus=new ArrayList<Menu>();
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
public Iterator<MenuItem> createIterator(){
	return new PancakeHouseMenuIterator<MenuItem>(menuitems);
	//return menuitems.iterator();
}

@Override
public Iterator<Menu> createIteratorMenu() {
	// TODO Auto-generated method stub
	return menus.iterator();
	//return new PancakeHouseMenuIterator<Menu>(menus);
}
}

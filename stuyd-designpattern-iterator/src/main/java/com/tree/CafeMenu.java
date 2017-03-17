package com.tree;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu{

	HashMap<String,MenuItem> menuitems;
	HashMap<String,Menu> menus;
	public CafeMenu(){
		menuitems=new HashMap<String,MenuItem>();
		menus=new HashMap<String,Menu>();
		menus.put("p", new PancakeHouseMenu());
		addItem("Veggie Burger and Air Fries c1","eggi burger on a whole wheat bun,lettuce,tomato,and fries",true,3.99);
		this.addItem("Soup of the day c2", "A cup of the soup of the day,whith a side salad", false, 3.69);
		this.addItem("Burrito c3", "A large burrito,with whole pinto beans,salsa,guacamole", true, 4.29);
	}

//	public MenuItem(String name, String descirption, boolean vegetarian,
//			double price)
	public void addItem(String name, String descirption, boolean vegetarian,double price){
		MenuItem m=new MenuItem(name,descirption,vegetarian,price);
		menuitems.put(name, m);
	}

	public HashMap<String, MenuItem> getMenuitems() {
		return menuitems;
	}


	public Iterator Iterator(){
		return new MenuIterator(this);
	}	
	
	public Iterator<MenuItem> createIterator() {
	// TODO Auto-generated method stub
	return menuitems.values().iterator();
	}



	@Override
	public Iterator<Menu> createIteratorMenu() {
		// TODO Auto-generated method stub
		return this.menus.values().iterator();
	}
	
}

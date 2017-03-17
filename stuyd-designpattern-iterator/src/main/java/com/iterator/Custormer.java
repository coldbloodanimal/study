package com.iterator;

public class Custormer {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DinerMenu dm=new DinerMenu();
		PancakeHouseMenu pm=new PancakeHouseMenu();
		Menu[] menu={new DinerMenu(),new PancakeHouseMenu(),new CafeMenu()};
		Waitress waiter=new Waitress(menu);
		//Menu menucafe=new PancakeHouseMenu();
		//waiter.getMenuItems(menucafe);
//		waiter.getVegetrianItems(dm.createIterator());
//		waiter.getVegetrianItems(pm.getMenuitems().iterator());
//		waiter.getMenuItems(dm.createIterator());
//		waiter.getMenuItems(pm.createIterator());
		waiter.getMenuItems();
	//	waiter.g
		
		
	}

}

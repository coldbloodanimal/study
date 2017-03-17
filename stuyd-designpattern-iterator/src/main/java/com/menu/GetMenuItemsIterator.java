package com.menu;

import com.menu.DinerMenu.Iterator;

public class GetMenuItemsIterator {
	 
		private DinerMenu dinermenu;
		private PancakeHouseMenu pancake;
		/**
		 * @param args
		 */
		
		public static void main(String[] args) {
			//GetMenuItemsNew g=new GetMenuItemsNew();
			// TODO Auto-generated method stub
			PancakeHouseMenu pancake=new PancakeHouseMenu();
			//pancake.
			DinerMenu dinermenu=new DinerMenu();

				
			MyIterator myiterator=dinermenu.createIterator();
			while (myiterator.hasnext()){
				
				MenuItem m=(MenuItem)myiterator.next();
				if((m!=null)&&m.isVegetarian()){
					
					System.out.println("itrator -->"+m);
				}
			}

		}

		public DinerMenu getDinermenu() {
			return dinermenu;
		}

		public PancakeHouseMenu getPancake() {
			return pancake;
		}

		public void getAllMenuItems(PancakeHouseMenu p,DinerMenu v){
			getMorningMenuItems( p);
			getDinerMenuItems( v);
		}
		
		public GetMenuItemsIterator() {
			dinermenu=new DinerMenu();
			 pancake=new PancakeHouseMenu();

		}
		public void getMorningMenuItems(PancakeHouseMenu p){
			for(int i=0;i<p.getMenuitems().size();i++){
			//dinermenu.getMenuItems();
			System.out.println(p.getMenuitems().get(i));
			}
		}
		public void getDinerMenuItems(DinerMenu p){
			for(int i=0;i<p.getMenuItems().length;i++){
			//dinermenu.getMenuItems();
			System.out.println(p.getMenuItems()[i]);
			}
		}
		public boolean isVegetarian(String name,MenuItem m){
			
			if (m.getName().equals(name)&&(m.isVegetarian())){
				return true;
			}else{
			return false;
			}
			
		}
		public void getVegetrianItems(Menu p){

			
			System.out.println("new way ");
			for(int i=0;i<p.getLength();i++){
			if(p.getMenuItem(i)!=null){
			if (p.getMenuItem(i).isVegetarian()){
			System.out.println(p.getMenuItem(i));
			}
			}
			}

			
		}
}

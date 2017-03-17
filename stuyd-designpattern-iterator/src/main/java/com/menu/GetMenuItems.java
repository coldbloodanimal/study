package com.menu;

public class GetMenuItems {
	private DinerMenu dinermenu;
	private PancakeHouseMenu pancake;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		GetMenuItems g=new GetMenuItems();
		// TODO Auto-generated method stub
		PancakeHouseMenu pancake=g.getPancake();
		
		DinerMenu dinermenu=g.getDinermenu();
		
		System.out.println("getbreakfast");
		g.getMorningMenuItems(pancake);
		System.out.println("diner");
		g.getDinerMenuItems(dinermenu);
		System.out.println("all");
		g.getAllMenuItems(pancake,dinermenu);
		
		System.out.println("vegetarian");
		g.getVegetrianItems(pancake, dinermenu);
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
	
	public GetMenuItems() {
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
	public void getVegetrianItems(PancakeHouseMenu p,DinerMenu v){
		for(int i=0;i<p.getMenuitems().size();i++){
		if (p.getMenuitems().get(i).isVegetarian()){
		System.out.println(p.getMenuitems().get(i));
		}
		}
		for(int i=0;i<v.getMenuItems().length;i++){
			if(v.getMenuItems()[i]!=null){
			if (v.getMenuItems()[i].isVegetarian()){
				System.out.println(v.getMenuItems()[i]);
				}
			}
		}
		
		System.out.println("new way ");
		for(int i=0;i<p.getLength();i++){
		if (p.getMenuItem(i).isVegetarian()){
		System.out.println(p.getMenuItem(i));
		}
		}
		
		for(int i=0;i<v.getLength();i++){
		if (v.getMenuItem(i).isVegetarian()){
		System.out.println(v.getMenuItem(i));
		}
		}
		
	}

}

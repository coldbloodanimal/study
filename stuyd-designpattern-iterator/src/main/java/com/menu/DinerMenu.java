package com.menu;

public class DinerMenu implements Menu{
	private static final int MAX_ITEMS=6;
	private int numberOfItems=0;
	MenuItem[] menuItems;
	
	
	




	public DinerMenu() {
		super();
		menuItems=new MenuItem[MAX_ITEMS];
		addItem("°ü×Ó","¾Â²Ë¼¦µ°",false,2.99);
		addItem("Ï¡·¹","°Ë±¦Öà",true,2.99);
		addItem("ÃæÌõ","µ°³´Ãæ",true,3.49);
		addItem("Ã×·¹","µ°³´Ãæ",true,3.59);
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
	public class Iterator implements MyIterator{
		private MenuItem[] mymenuItems=menuItems;
		private int Max=mymenuItems.length;
		private  int mycount=-1;
		public boolean hasnext(){
			if(mycount<Max-1){
				mycount++;
				System.out.println("myc"+mycount);
				return true;
			}else{
				return false;
			}
			
		}
		public MenuItem next(){
			try {
				return mymenuItems[mycount];
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return mymenuItems[mycount];
		}
		
	}
	
	
	public Iterator createIterator(){
		
		return new Iterator();
	}
	
}

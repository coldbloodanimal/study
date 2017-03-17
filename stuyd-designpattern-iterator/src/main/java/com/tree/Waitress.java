package com.tree;
import java.util.Iterator;
import com.tree.MenuItem;

public class Waitress {
	
	private Menu[] menu;
	
	
	
	public Waitress() {
		super();
	}
	
	public Waitress(Menu[] menu) {
		super();
		this.menu = menu;
	}
	
	public void getVegetrianItems(){
		for(int i=0;i<menu.length;i++){
		 	getVegetrianItems(menu[i].createIterator());
		}
	}
	
	public void getVegetrianItems(Iterator<MenuItem> p) {
		try {
			while(p.hasNext()){
				
				MenuItem m=(MenuItem)p.next();
				if(m!=null&&isVegetarian(m.getName(),m)){
				
				System.out.print("name:"+m.getName()+"\t");
				System.out.println("description:"+m.getDescirption());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public boolean isVegetarian(String name,MenuItem m){
		
		if (m.getName().equals(name)&&(m.isVegetarian())){
			return true;
		}else{
		return false;
		}
		
	}
	
	public void getMenuItems(){
		for(int i=0;i<menu.length;i++){
			getMenuItems(menu[i].createIterator());
		}
		
	}
	
	public void getMenuItems(Iterator<MenuItem> i){
		
		while(i.hasNext()){

			MenuItem m=i.next();
			if(m!=null){
			System.out.print("name:"+m.getName()+"\t");
			System.out.print("price :"+m.getPrice()+"\t");
			System.out.println("description:"+m.getDescirption());
			}
		}
		
	};
	
	
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

package com.iterator;
import java.util.Iterator;
import com.iterator.MenuItem;

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
}

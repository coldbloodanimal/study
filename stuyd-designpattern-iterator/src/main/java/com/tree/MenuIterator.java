package com.tree;
import java.util.Iterator;
public class MenuIterator implements Iterator{
	private Iterator<MenuItem> iterator;
	private Iterator<Menu> menuIterator;
	private Menu menu;
	
	public MenuIterator(Menu menu) {
		super();
		this.menu = menu;
		if(menu.createIterator()!=null){
		iterator=menu.createIterator();
		}else{
		menuIterator= menu.createIteratorMenu();
		while(menuIterator.hasNext()){
			iterator=menuIterator.next().createIterator();
		}
		}
		
	}



	@Override
	public boolean hasNext() {
		if(iterator.hasNext()){
			return true;
		}else {
			iterator=menuIterator.next().createIterator();
		}
		return false;
	}

	@Override
	public MenuItem next() {
		//menuitemIterator.
		return iterator.next();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}

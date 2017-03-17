package com.tree;

import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenuIterator<E> implements Iterator<E>{
	ArrayList<E> menuitems;
	private int position;
	@Override
	public boolean hasNext() {
		if(position<menuitems.size()){
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		E m=menuitems.get(position);
		position++;
		return m;
	}

	@Override
	public void remove() {
		menuitems.remove(position-1);
		
	}

	public PancakeHouseMenuIterator(ArrayList<E> menuitems) {
		super();
		this.menuitems = menuitems;
	}




}

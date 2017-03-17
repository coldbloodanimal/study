package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenuIterator<E> implements Iterator<E>{
	ArrayList<E> menuitems;
	private int position;
	public boolean hasNext() {
		if(position<menuitems.size()){
			return true;
		}
		return false;
	}

	public E next() {
		E m=menuitems.get(position);
		position++;
		return m;
	}

	public void remove() {
		menuitems.remove(position-1);
		
	}

	public PancakeHouseMenuIterator(ArrayList<E> menuitems) {
		super();
		this.menuitems = menuitems;
	}




}

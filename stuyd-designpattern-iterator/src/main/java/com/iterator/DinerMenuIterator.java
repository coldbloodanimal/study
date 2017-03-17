package com.iterator;
import java.util.Iterator;
public class DinerMenuIterator<E> implements Iterator<E>{
//public class DinerMenuIterator implements com.iterator.Iterator{
	private E[] menuitems;
	private int position=0;
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position<menuitems.length){
			return true;
		}
		return false;
	}

	public E next() {
		// TODO Auto-generated method stub
		
			E m=menuitems[position];
			position=position+1;
			return m;
			/*
			try {
				MenuItem m=menuitems[position];
				if(m!=null){
				return m;
				}else{
					position++;
				}
	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("index is "+ position);
				return null;
			}finally{
			
			position++;
			System.out.println("haha");

			}
		*/
		
	}

	public DinerMenuIterator(E[] menuitems) {
		super();
		this.menuitems = menuitems;
	}

	public void remove() {
		menuitems[position-1]=null;

	}

}

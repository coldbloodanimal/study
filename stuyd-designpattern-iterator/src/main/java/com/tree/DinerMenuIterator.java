package com.tree;
import java.util.Iterator;
public class DinerMenuIterator<E> implements Iterator<E>{
//public class DinerMenuIterator implements com.iterator.Iterator{
	
	private E[] e;
	private int position=0;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position<e.length){
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		
			E m=e[position];
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
		this.e = menuitems;
	}

	@Override
	public void remove() {
		e[position-1]=null;

	}

}

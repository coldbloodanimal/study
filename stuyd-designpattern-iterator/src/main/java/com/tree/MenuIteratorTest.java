package com.tree;
import java.util.Iterator;
public class MenuIteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CafeMenu menu=new CafeMenu();
		Iterator iterator=menu.Iterator();
		
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}		
	}

}

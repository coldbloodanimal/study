package com.starbuzz.book;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b=new Espresso();
		b=new Milk(b);

		b=new Mocha(b);
		b=new Mocha(b);
		
		System.out.println(b.getDescription());
		System.out.println(b.cost());
	}

}

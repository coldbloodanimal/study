package com.starbuzz;



public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b1=new Milk();
		Beverage b2=new Coffee();
		Seasoning s1=new Mocha();
		Seasoning s2=new Soy();
		Seasoning s3=new Chocolate();
		
		b1.add(s1);
		b1.add(s2);
		
		b2.add(s2);
		b2.add(s3);
		System.out.println("this is b1");
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
		System.out.println("******************");
		System.out.println("this is b2");
		System.out.println(b2.getDescription());
		System.out.println(b2.cost());
		
	}
}

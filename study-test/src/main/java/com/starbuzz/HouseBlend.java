package com.starbuzz;

public class HouseBlend implements Beverage{
	
	
	private double cost=30;
	private String description="HouseBlend";
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public void add(Seasoning s) {
		// TODO Auto-generated method stub
		
	}

}

package com.starbuzz.book;

public class Milk extends CondimentDecorator{

	private Beverage beverage;

	public Milk(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+","+"milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.1+this.beverage.cost();
	}

}

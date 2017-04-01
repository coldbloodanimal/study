package com.starbuzz.book;

public class Mocha extends CondimentDecorator{

	private Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+","+"Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.2+this.beverage.cost();
	}

}

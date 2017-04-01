package com.starbuzz;

import java.util.ArrayList;
import java.util.Arrays;

public class Milk implements Beverage {
	private double cost=10;
	private String description="milk";
	private ArrayList<Seasoning> myseasoings=new ArrayList<Seasoning>();
	
	public void add(Seasoning s){
		this.myseasoings.add(s);
		return;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		for(Seasoning p : myseasoings){
			this.cost=this.cost+p.cost();
		}
		return this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		this.description=this.description+" has ";
		for(Seasoning p : myseasoings){
			this.description=this.description+p.getDescription();
		}
		return this.description;
	}
	
	public ArrayList<Seasoning> getSeasoning(){
		return this.myseasoings;
	}

}

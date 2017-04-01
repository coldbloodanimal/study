package com.duck;

public class CompareDuck extends Duck implements Comparable<CompareDuck> {

	
	private String name;
	private int weight;
	public CompareDuck(String name,int weight) {
		this.name=name;
		this.weight=weight;
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
		
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int compareTo(CompareDuck o) {
		if(this.weight>o.getWeight()){
			return 1;
		}else if(this.weight==o.getWeight()){
			return 0;
		}else if(this.weight==o.getWeight()){
			return -1;
		}
		return 0;
	}



	@Override
	public String toString() {
		return "CompareDuck [name=" + name + ", weight=" + weight + "]";
	}

}

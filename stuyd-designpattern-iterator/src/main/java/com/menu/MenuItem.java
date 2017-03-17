package com.menu;

public class MenuItem  {
private String name;
private String descirption;
private boolean vegetarian;
private double price;
public MenuItem(String name, String descirption, boolean vegetarian,
		double price) {
	super();
	this.name = name;
	this.descirption = descirption;
	this.vegetarian = vegetarian;
	this.price = price;
}
public String getName() {
	return name;
}
public String getDescirption() {
	return descirption;
}
public boolean isVegetarian() {
	return vegetarian;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	return "MenuItem [name=" + name + ", descirption=" + descirption
			+ ", vegetarian=" + vegetarian + ", price=" + price + "]";
}


}

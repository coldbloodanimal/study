package com.starbuzz.book;

public abstract class CondimentDecorator extends Beverage{
	//父类中的变量，子类是否可以继承
	//private Beverage beverage;
	public abstract String getDescription();
}

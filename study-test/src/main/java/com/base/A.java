package com.base;

public class A {
	private int a;
	
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public A(int a) {
		super();
		this.a = a;
	}


	public void add(){
		a=a+1;
	}

	public int getA() {
		return a;
	}

	public void setA(int a){
		this.a=a;
	}
	
}

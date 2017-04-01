package com.test.chapter4;

public class baby {
	private String name;
	private String sex;
	private int age;
	public baby(String n,String s,int a){
		name=n;
		sex=s;
		age=a;
	}
	public baby(){}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}

}

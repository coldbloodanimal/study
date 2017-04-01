package com.test.myinterface;

public class Dog implements Animal{

	private String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog;
		dog=new Dog("qiqi");
		System.out.println(dog.getName());
		System.out.println(IT);
	
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name) {
		super();
		this.name = name;
	}
	

}

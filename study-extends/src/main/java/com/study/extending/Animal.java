package com.study.extending;

public class Animal implements Creature{
	private String name;
	private int age;
	public String pc;
	public void say(){
		System.out.println("animal:say");
	}
	  void eat() {
		    System.out.println("animal : eat");
		  }
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Animal(String name, int age)");
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal() {
		super();
		System.out.println("Animal()");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

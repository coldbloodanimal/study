package com.study.extending;

public class Dog extends Animal {
	private String dogType;
	private String pc;

	void eat() {
		System.out.println("dog : eat");
	}

	void anotherEat() {
		super.eat();
		pc=super.pc;
	}

	Dog() {
		System.out.println("Dog()");
	}

	Dog(String dogType) {
		super("Dog", 10);
		this.dogType = dogType;
		System.out.println("Dog(String dogType)");

	}

	public static void main(String[] args) {
//		Dog d = new Dog("hehe");
//		System.out.println(d.getName());
//	    Animal a = new Animal();
//	    a.eat();
	    Dog d = new Dog();
//	    d.eat();
//	    d.anotherEat();
	}
}

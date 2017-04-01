package com.duck;

public class Quack implements QuackBehavior{


	public static void main(String[] args){
		MyQuack q=(MyQuack) new Quack();
		q.quack();
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("i'm quack!");
	}

}

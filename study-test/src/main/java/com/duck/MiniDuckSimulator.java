package com.duck;

public class MiniDuckSimulator extends Duck{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck=new MallardDuck();
		Duck gagaduck=new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
		
		if(duck.equals(gagaduck)){
			System.out.println("the same");
		}else{
			System.out.println("not the same");
		}
		
	}

}

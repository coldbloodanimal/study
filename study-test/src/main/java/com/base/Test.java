package com.base;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(3);
		System.out.println(a.getA());
		change(a);
		System.out.print("outer "+a.getA());
		
	}
	public static void change(A a){
		a.add();
		a.add();
		System.out.print("change "+a.getA());
	}

}

package net.mindview.util;

public class ThreeTupleMine< A, B,C> extends TwoTuple<A,B>{

	private C c;
	public ThreeTupleMine(A a,B b,C c) {
		super(a, b);
		this.c=c;
	}
	public String toString() {
	    return "(" + first + ", " + second +", " + c + ")";
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeTupleMine<String,Integer,Double> t=new ThreeTupleMine<String,Integer,Double>("haha",2,4.9);
		System.out.println(t);
	}

}

package com.test.pure;

import java.util.Date;

public class Test {
	private String name;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String son="xiaoming";
		String daughter="xiaohong";
		Test test=new Test();
		test.hello();
		test.changeHisName(son,daughter);
		System.out.println("son "+son);
	}

	public void changeHisName(String A,String B){
		String temp;
		temp=A;
		A=B;
		B=A;

	}

	
	public Test() {
		super();
		this.name="Test";
		Date date=new Date();

		// TODO Auto-generated constructor stub
	}

	public void hello() throws Exception{
		 try {
			throw new Exception("no this method");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

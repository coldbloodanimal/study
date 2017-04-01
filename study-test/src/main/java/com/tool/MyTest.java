package com.tool;
import com.people.*;

public class MyTest {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
//	MyTest mt=new MyTest();
//	System.out.println(mt.copy(5));
//	System.out.println(mt.copy("good"));
	
		try {
			Manager e=new Manager(null);
			Object o=Class.forName("com.people.Manager").newInstance();
			System.out.println(o.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int copy(int x){
		return 5;
	}
	
	public int copy(String x){
		
		return 6;
	}

}

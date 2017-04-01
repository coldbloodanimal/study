package com.duck;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareDuck cduck[]={
		new CompareDuck("luly", 20),
		new CompareDuck("ali", 30),
		new CompareDuck("liming", 8),
		new CompareDuck("huhe", 25)
		};

		display(cduck);
		
		Arrays.sort(cduck);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		display(cduck);
		//System.out.println(cduck.toString());
		
		
	}
	static void display(CompareDuck[] duck){
		for(int i=0;i<duck.length;i++){
			//System.out.println(duck.);
			System.out.println(duck[i].toString());
		}
	}

}

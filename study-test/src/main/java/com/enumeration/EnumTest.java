package com.enumeration;

import java.util.Scanner;

import com.duck.Duck;
import com.duck.MallardDuck;

public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a size:(SMALL,MEDIM,LARGE,EXTRA_LARGE)");
		String input=in.next().toUpperCase();
		Duck duck=new MallardDuck();
		duck.performFly();
		//System.out.println("duck.getName()->"+duck.getName());
		System.out.println("duck.getClass().getName()->"+duck.getClass().getName());
		System.out.println("Duck.class->"+Duck.class);
		Size size=Enum.valueOf(Size.class,input);
		System.out.println("size.class->"+Size.class);
		System.out.println("abbreviation="+size.getAbbreviation());
		
	}

}

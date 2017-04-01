package com.test.chapter4;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Date();
		System.out.println("Date"+new Date());
		System.out.println("Calendar"+new GregorianCalendar().get(Calendar.MONTH));
	}

}

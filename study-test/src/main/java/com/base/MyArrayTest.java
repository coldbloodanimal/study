package com.base;

import java.util.Arrays;

public class MyArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		for(int i=0;i<100;i++){
			
			a[i]=i;
		}
		
		for(int i=0;i<100;i++){
			
			System.out.println(a[i]);
		}
		System.out.println("**************");
		for(int i:a){
			System.out.println(i);
		}
		System.out.println(Arrays.toString(a));
	}

}

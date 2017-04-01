package com.myarray;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayTest {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[100];
		for(int i=0;i<100;i++){
			a[i]=(int) (Math.random()*100);
			System.out.print(a[i]+"\t");
		}
		// TODO Auto-generated method stub
//		int[] a=new int[100];
//		
//		for(int i=0;i<100;i++){
//			a[i]=i*i;
//		}
//		int[] b;
//		for(int i=0;i<100;i++){
//			if(i%10!=0){
//				System.out.print(a[i]+"\t");
//			}else{
//				System.out.println(a[i]);
//			}
//		}
//		for(int i:a){
//			System.out.println(i);
//		}
//		//System.out.println((ArrayList)a.toString());
//		b=Arrays.copyOf(a, 2*a.length);
//		for(int i:b){
//			System.out.println(i);
//		}
//		if(args[0].equals("-h")){
//			System.out.println("hello");
//		}else if(args[0].equals("-g")){
//			System.out.println("good bye");
//		}
		
//		for(int i:a){
//			System.out.println(i);
//		}
//		
		System.out.println();
		Arrays.sort(a);
		for(int i:a){
		System.out.print(i+"\t");
	}
		System.out.println();
		System.out.println(Arrays.toString(a));
	
		
		
	}

}

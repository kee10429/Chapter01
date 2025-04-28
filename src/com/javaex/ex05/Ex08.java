package com.javaex.ex05;

public class Ex08 {
	public static void main(String[] args) {
		
		
		//배열A 
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 7;
		
		//배열 B
		int[] arrB = new int[3];
		arrB[0] = 3;
		arrB[1] = 6;
		arrB[2] = 7;
		
		for(int i=0;i<3;i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("-------------------------------");
		
		for(int i=0;i<3;i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("---------------------------------");
		arrA[1] = 100;
		
		
	}
	
}

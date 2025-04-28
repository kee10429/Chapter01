package com.javaex.ex05;

public class Ex10 {

	public static void main(String[] args) {
		
		 int[] arrA = new int[3];
		 arrA[0] = 3;
		 arrA[1] = 6;
		 arrA[2] = 7;
		 
		 int[] arrB = new int[3];
		 
		 //같은방끼리 값을 복사한다  A---->B
		 for(int i=0; i<3; i++) {
			 arrB[i] = arrA[i];
		 }
		 
		 arrB[0] = arrA[0];
		 arrB[1] = arrA[1];
		 arrB[2] = arrA[2];
		 
		 
		 for(int i=0;i<3;i++) {
			 System.out.println(arrA[i]);
		 }
		 
		 System.out.println("-------------------------");
		 
		 for(int i=0;i<3;i++) {
			 System.out.println(arrB[i]);
		 }

	}

}

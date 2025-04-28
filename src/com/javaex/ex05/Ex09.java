package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		int no = 5;
		int var = no;
		*/
		
		int[] arrA = new int[3];
		arrA[0]= 3;
		arrA[1]= 6;
		arrA[2]= 7;
		
		//이 부분이 중요
		int[] arrB = arrA;
		
		//arrA 출력
		for(int i=0; i<3; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("-------------------------------");
		
		//arrB출력
		for(int i=0; i<3; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("-------------------------------");
		
		arrA[1] = 100;
		
		//arr출력
		for(int i=0;i<3;i++) {
			System.out.println(arrB[i]);
		}
		System.out.println("--------------------------------");
		
		//arrB를 통해서 [2]을 100으로 변경
		//arrA 와 arrB 동시에 바뀌는지 확인
		arrB[2] = 999;
		for(int i=0;i<3;i++) {
			System.out.println(arrB[i]);
		}
		
		
		
	}

}

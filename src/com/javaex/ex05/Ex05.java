package com.javaex.ex05;

public class Ex05 {
	public static void main(String[] args) {
		
		
		int[] intArr01 = new int[3];
		intArr01[0] = 3;
		intArr01[1] = 6;
		intArr01[2] = 45;
		
		
		/*
		int[] intArr = new int[] {3,6,35}
						//숫자를 빼야한다
		*/
		
		//추천하지 않음
		/*
		int[] intArr = {3,6,35};
		*/
		
		for(int i=0;i<intArr01.length;i++) {
			System.out.println(intArr01[i]);
		}
		
		
	}
}

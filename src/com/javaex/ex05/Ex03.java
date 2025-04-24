package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로또번호
		
		int[] lottos = new int [6];
		
		
		
		
		/*
		 // 이 경우는 규칙이 일정해서 for문을 사용할 수 있다(입력은 아닌 경우가 많다)
		lottos[0]=(int)(Math.random()*45)+1;
		lottos[1]=(int)(Math.random()*45)+1;
		lottos[2]=(int)(Math.random()*45)+1;
		lottos[3]=(int)(Math.random()*45)+1;
		lottos[4]=(int)(Math.random()*45)+1;
		lottos[5]=(int)(Math.random()*45)+1;
		*/
		
		for(int i=0;i<6;i++) {
			lottos[i]= (int)(Math.random()*45)+1;
		}
		
		/*
		System.out.println(lottos[0]); 
		System.out.println(lottos[1]); 
		System.out.println(lottos[2]); 
		System.out.println(lottos[3]); 
		System.out.println(lottos[4]); 
		System.out.println(lottos[5]);
		*/
		
		for(int i=0; i<6; i++) {
			System.out.println(lottos[i]);
		}
		
		
	}

}

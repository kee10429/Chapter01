package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		for(int i=0;i<9;i++) {	
			System.out.println(dan + " * " + (i+1) + " = " + dan*(i+1) );
		}
		
		
		sc.close();
	}

}

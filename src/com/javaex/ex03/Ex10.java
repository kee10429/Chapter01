package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("과목:");
		int code = sc.nextInt();
		
		switch(code) {
			case 1: //code==1
				System.out.println("R101");
				break;
				
			case 2: // code==2
				System.out.println("R202");
				break;
				
			case 3: //code==3
				System.out.println("R303");
				break;
				
			case 4: 
				System.out.println("R404");
				break;
				
			default: //나머지 else
				System.out.println("상담원");
		}
		
		sc.close();
	}
}

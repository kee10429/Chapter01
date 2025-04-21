package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("과목을 선택하세요");
		System.out.print("과목:");
		String code = sc.nextLine();
		
		switch(code) { //A,B,C,D,E, F G
			case "A": //code==A
				System.out.println("R101");
				break;
				
			case "B": // code==2
				System.out.println("R202");
				break;
				
			case "C": //code==3
				System.out.println("R303");
				break;
				
			case "D": 
				System.out.println("R404");
				break;
				
			default: //나머지 else
				System.out.println("상담원");
		}
		
		sc.close();
	}

}

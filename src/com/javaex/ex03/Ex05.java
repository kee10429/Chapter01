package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		double time = sc.nextInt();
		
		double sum;
		
		if(time<=8) {
			sum = time*10000;
			
		} else {
			sum = (time-8)*10000*1.5+8*10000;
		}
		
		System.out.println("임금은 "+ sum + "원 입니다.");

		sc.close();
	}
}

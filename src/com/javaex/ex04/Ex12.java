package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int sum = 0;  //숫자를 누적한 값
		int num;
		
		do {
			//숫자입력
			num = sc.nextInt();
			//합계
			sum = sum + num;
			//합계 출력
			System.out.println("합계: " + sum);
				
		} while(num != 0);
		
		
		sc.close();
		*/
		
		///////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int sum = 0;
		
		while(true) {
			int num = sc.nextInt();//숫자 입력받음
			sum = sum + num;
			System.out.println("합계:"+ sum); //출력
			
			if(num==0) {//0이면 끝
				break; //반복문 끝
			}
			
		}
		
		System.out.println("종료");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}

/*
while(true) {
	
	//숫자입력
	//합계
	if(입력숫자가 == 0) {
		break;
	}
}
*/

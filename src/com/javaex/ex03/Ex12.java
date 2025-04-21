package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int code = sc.nextInt();
		
		switch(code) {
			case 1,3,5,7,8,10,12:
				System.out.println("31일");
				break;
				
			case 2:
				System.out.println("28일");
				break;
				
			case 4,6,9,11:
				System.out.println("30일");
				break;
			
					
		}
		
		sc.close();
		
		/* (선생님, 하지만 break없는 switch-case문은 권장하진 않음)
		 switch(code) {
		 	case 4:
		 	case 6:
		 	case 9:
		 	case 11:
		 	 	System.out.println("30일");
		 	 	break;
		 	 	
	 	 	case 2:
	 	 		System.out.println("28일");
	 	 		break;
	 	 		
 	 		default:
 	 			System.out.println("31일");
	 	 		break;
		 
		 */
		
	}
}

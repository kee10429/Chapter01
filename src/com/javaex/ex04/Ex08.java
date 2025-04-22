package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 1;
		
		while(true) {
			
			if(no%6==0 && no%4==0) {
				break;
			}
			System.out.println("현재:" + no);
			no++;
		}
		
		System.out.println("정답:" + no);
	}

}

package com.javaex.ex05;

public class Ex12 {
	public static void main(String[] args) {
		
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("입력된 옵션---------------------------");
		
		System.out.println(args[0]);
		
		for(int i=0;i<args.length;i++) {
			if(args[0].equals("-v")){
				System.out.println("버전 3.0");
			}
			
			if(args[0].equals("-d")){
				System.out.println("만든날짜: 2025-04-28");
			}
			
			if(args[0].equals("-n")){
				System.out.println("만든사람: 황일영");
			}
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}


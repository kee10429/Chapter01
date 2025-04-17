package com.javaex.ex02;

public class Ex01 {
	public static void main(String[]args) {
		
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("--------------------------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "한";
		String str = "굿모닝";
		String name = "한기정";
		
		System.out.println(str);
		System.out.println(name);
		System.out.println("굿모닝"+"한기정");
		System.out.println(str + name);
		System.out.println(str + name +str);
		
		System.out.println(i+i); //정수+실수
		System.out.println(i+d); //정수+실수==>실수(자동형변환)+실수
		System.out.println(str+i);
		System.out.println(str+d);
		
		String result = name + d; //문자열+정수==>문자열, 문자열+실수==>문자열
		System.out.println(result);
		
		//굿모닝랑한기정
		String r = "랑";
		
		System.out.println(str+r+name);
		
		System.out.println(str+"랑"+name);  //글자에는 무조건 ""로 표시해주기
		
		//굿모닝 랑 한기정
		System.out.println(str+" 랑 "+name);
		
		//굿모닝 한기정
		System.out.println(str+" "+name);
		
		//제 이름은 한기정 입니다.
		System.out.println("제 "+"이름은 "+name+" 입니다.");
		
		System.out.println("--------------------------------------");
		System.out.println(c);   //한
		System.out.println(c+c);  //한한 char형(코드값숫자로관리)은 + 숫자더하기 
		
		//제 이름은 "한기정" 입니다.
		System.out.println("제 이름은 \"" + name + "\" 입니다.");
		
		//제 이름은 \한기정\ 입니다.
		System.out.println("제 이름은 \\" + name+ "\\ 입니다.");
		
		System.out.println("나의이름은\t" + name + "입니다.");
	}
}

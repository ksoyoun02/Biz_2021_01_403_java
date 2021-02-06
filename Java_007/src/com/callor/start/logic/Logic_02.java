package com.callor.start.logic;

public class Logic_02 {
	
	public static void main(String[] args) {
		
		// 3과 3이 같은가 판단하고 그 값을 bYes에 담아라
		// 불값, 논리연산결과를 담는 변수
		// boolean : 자바가 시작할때 만들어짐 Boolean : 그 후 기능 추가
		boolean bYes = 3 == 3;
		bYes = 3 > 3;
		System.out.println(bYes);
		
		bYes = 3 >= 3 ;
		
		int num1 = 55;
		int num2 = 65;
	
		bYes = num1 >= num2;
		
		// 곱셈연산이 논리연산보다 우선순위높음
		bYes = num1*2 >= num2;
		bYes = (num1*2) >= num2;
		
		
	}

}

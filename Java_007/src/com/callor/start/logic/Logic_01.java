package com.callor.start.logic;

public class Logic_01 {
	
	
	/*
	 * 논리(Logic) 연산
	 * 참(yes, true), 거짓(no, false)를 판단하여
	 * 어떤 행위를 수행하는 연산
	 */
	
	public static void main(String[] args) {
		
		// < 논리연산 5가지 연산식! >
		
		// 3이 3 미만인가? (보다 작은가?)
		System.out.println( 3 < 3 );
		System.out.println( 3 > 3 );
		
		// = 1개와(연산, 대입...) == 2개는 다름(논리연산)
		// 3이 3과 같은가?
		System.out.println( 3 == 3 );
		
		// 3이 3이하(보다 작거나 같은가?)
		// 부등호 + '='  반대로 하면 오류남
		System.out.println( 3 <= 3 );
		
		// 3이 3이상(보다 크거나 같은가?)
		System.out.println( 3 >= 3 );
		
	}

}

package com.callor.start;

public class Odd_Eve_01 {

	public static void main(String[] args) {

		int intsum = 0;
		// 0~99
		for (int i = 0 ; i < 100 ; i++) {
			
			int num = i + 1;
			boolean bYes = num % 2 == 0;
			
			// 만약 bYes true 이면
			if (bYes) {

				intsum += num;

			}
		}
		System.out.println("1 ~ 100까지 짝수의 합 : " + intsum);

		intsum = 0;
		for (int i = 0; i < 100; i++) {
			
			int num = i + 1;
			boolean bYes = num % 2 == 1;
			
			if (bYes) {

				intsum += num;

			}
		}
		System.out.println("1 ~ 100까지 홀수의 합 : " + intsum);
		
		//위에서 선언하고 사용했던 변수를 "재 사용"하기
		// 반드시 초기화(clear)해야한다
		intsum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 0;
			
			
			// if( bYes == false ) {
			
			// bYes가 true가 아니면	
			if( !bYes ) {
				
				intsum += num;
				
			}
		}
		System.out.println("홀수의 합 : " + intsum);
		

		// 값을 변수에 계속 더하라

	}
	// 결과값을 출력하라
}

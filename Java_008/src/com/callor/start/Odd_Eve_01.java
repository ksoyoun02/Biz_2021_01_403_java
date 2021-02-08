package com.callor.start;

public class Odd_Eve_01 {

	public static void main(String[] args) {

		int intsum = 0;
		// 0~99
		for (int i = 0; i < 100; i++) {
			boolean bYes = (i+1) % 2 == 0;

			// 만약 bYes true 이면
			if (bYes) {

				int num = i + 1;
				intsum += num;

			}
		}
		System.out.println("1 ~ 100까지 짝수의 합 : " + intsum);

		intsum = 0;
		for (int i = 0; i < 100; i++) {
			boolean bYes = i % 2 == 1;

			if (bYes) {

				int num = i;
				intsum += num;

			}
		}
		System.out.println("1 ~ 100까지 홀수의 합 : " + intsum);

		// 값을 변수에 계속 더하라

	}
	// 결과값을 출력하라
}

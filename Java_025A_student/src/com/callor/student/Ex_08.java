package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여
 * 10 ~ 100 까지 임의의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서
 * Console 출력
 */
public class Ex_08 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[100];

		for (int i = 0; i < intNum.length; i++) {

			intNum[i] = rnd.nextInt(91) + 10;
		}
		
		for (int i = 0; i < intNum.length; i++) {
			
			int index = 0;
			for (index = 2; index < intNum[i]; index++) {

				if (intNum[i] % index == 0) {
					break;
				}
			}

			if (index == intNum[i]) {
				System.out.println(intNum[i] + "는 소수");

			} 
		}

	}

}

package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

/*
 *  1. HomeWork_01의 main() method에서
 *  2. Random 클래스를 사용하여 "2이상의 임의의 정수" 100개를 만들고
 *  3. PrimeServiceV2의 prime()메서드를 호출하여
 *  4. 임의의 정수 100개 중 소수인 수 들의 리스트를 출력
 *  5. 소수인 수 들의 합을 계산하여 출력
 */

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		// 배열생성
		int[] intNum = new int[100];
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		// intNum[0] ~ intNum[99]까지의 배열에 random값 부여
		for (int i = 0; i < 100; i++) {

			intNum[i] = rnd.nextInt(1000) + 2;

		}

		int intSum = 0;
		System.out.println("임의의 정수 100개 중 소수인 수 :");

		for (int i = 0; i < 100; i++) {
			
			// psV2의 return(-1 or intNum[i]) 값을 result 변수 값에 담기
			int result = psV2.prime(intNum[i]);

			// return 값이 inNum[i] 값인 경우 => 2 이상의 정수 중 소수인 경우
			if (result > 0) {

				// 소수인 수 출력
				System.out.print(intNum[i] + " ");
				// intNum[i]값의 합
				intSum += intNum[i];

			}

		}
		System.out.println();
		System.out.println("소수인 수들의 합 : " + intSum);

	}
}

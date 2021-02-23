package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[100];

		PrimeServiceV2 psV2 = new PrimeServiceV2();

		for (int i = 0; i < 100; i++) {
			
			intNum[i] = rnd.nextInt(1000) + 2;

		}
		
		int intSum = 0;
		System.out.println("임의의 정수 100개 중 소수인 수 :");
		for (int i = 0; i < 100; i++) {

			int result = psV2.prime(intNum[i]);

			if (result < 0) {

			} else {
				System.out.print(intNum[i] + " ");
				intSum += intNum[i];

			}

		}
		System.out.println();
		System.out.println("소수인 수들의 합 : " + intSum);

	}
}

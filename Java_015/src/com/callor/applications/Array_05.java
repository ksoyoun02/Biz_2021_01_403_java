package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(100) + 1;

		}
		
		System.out.print("3의 배수이면서 5의 배수인 값 : ");
		
		int intSum = 0;
		for (int i = 0; i < intNums.length; i++) {

			boolean b3Yes = intNums[i] % 3 == 0;
			boolean b5Yes = intNums[i] % 5 == 0;

			if (b3Yes && b5Yes) {

				System.out.print(intNums[i] + " ");
				intSum += intNums[i];

			}
		}
		System.out.println();
		System.out.println("합 : " + intSum);
	}

}

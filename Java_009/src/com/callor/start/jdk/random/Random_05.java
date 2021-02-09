//연습
package com.callor.start.jdk.random;

import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int intsum = 0;
		for (int i = 0; i < 100; i++) {

			
			int num = rnd.nextInt(100) + 1; //1~100까지 중 랜덤
			System.out.println(num);  //랜덤 수 

			boolean bYes = num % 2 == 0;  
			
			if (bYes) {

				intsum += num;
			}

		}
		System.out.println("1 ~ 100 까지 임의의 숫자 중 짝수 100개의 합 : " + intsum);
	}

}

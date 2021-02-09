package com.callor.start.jdk.random;

import java.util.Random;

public class Random_06 {

	public static void main(String[] args) {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {

			int num = rnd.nextInt(100) + 1;

			System.out.println(num);

			boolean bYes = (num > 34);

			if (bYes) {
				System.out.println(num + "는 : " + (i+1) + "번째");
				
				break;

			}

		}
	}
}
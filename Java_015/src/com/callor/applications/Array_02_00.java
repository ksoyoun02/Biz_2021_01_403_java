package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02_00 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int keyNum = 0;

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("1 ~ 10 까지 중 정수 입력 >> ");
		keyNum = scan.nextInt();

		for (int position = 0;  position < intNums.length; position++) {

			if (intNums[position] == keyNum) {

				System.out.println("intNumbs의 " + position + "번째");
				// break;
			}
		}

	}
}

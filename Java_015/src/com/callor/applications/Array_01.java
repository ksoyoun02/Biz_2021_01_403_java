package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int count = 0;

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;

		}
		
		int num = 0;
		System.out.print("1 ~ 10까지 중 정수입력 >> ");
		num = scan.nextInt();

		for (int i = 0; i < intNums.length; i++) {

			boolean bYes = intNums[i] == num;

			if (bYes) {

				System.out.print(num + ", ");
				count += 1;
			}

		}
		System.out.println();
		System.out.println(num + "은 " + count + "개");
	}
}

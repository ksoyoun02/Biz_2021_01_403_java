package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class keyInput_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력 >> ");
		int num = scan.nextInt();

		if (num > num1) {
			System.out.println(num + "은(는) " + num1 + "보다 크다");
		}
		if (num == num1) {
			System.out.println(num + "은(는) " + num1 + "과 같다");
		}

		if (num < num1) {
			System.out.println(num + "은(는) " + num1 + "보다 작다");
		}

	}

}

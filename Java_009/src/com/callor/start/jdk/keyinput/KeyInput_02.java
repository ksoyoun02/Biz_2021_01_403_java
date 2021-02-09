package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {

		System.out.println();
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력 >> ");
		int intNum = scan.nextInt();

		if (intNum % 2 == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");
		}
	}
}

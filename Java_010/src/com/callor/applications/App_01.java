package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// while( i < 7 ){
		// int num = i + 2;

		System.out.print("숫자입력(2~9) >> ");
		int KeyNum = scan.nextInt();

		System.out.println("====================");

		if (KeyNum == 2) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
		if (KeyNum == 3) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
		if (KeyNum == 4) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
		if (KeyNum == 5) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
		if (KeyNum == 6) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
		if (KeyNum == 7) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
		if (KeyNum == 8) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
		if (KeyNum == 9) {
			System.out.println("구구단" + KeyNum + "단");
			System.out.println("--------------------");

			for (int i = 0; i < 10; i++) {
				System.out.println(KeyNum + " x " + i + " = " + KeyNum * i);
			}
		}
	}
}

package com.callor.applications;

import java.util.Scanner;

public class App_01_00 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// while( i < 7 ){
		// int num = i + 2;

		System.out.print("숫자입력(2~9) >> ");
		int KeyNum = scan.nextInt();

		System.out.println("====================");

		System.out.println("구구단" + KeyNum + "단");
		System.out.println("--------------------");
		

		for (int i = 0; i < 8; i++) {
			int num = i + 2;
			System.out.println(KeyNum + " x " + num + " = " + KeyNum * num);
			}
		}
		
	}


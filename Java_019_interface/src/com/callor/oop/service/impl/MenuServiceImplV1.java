package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {

	private Scanner scan = new Scanner(System.in);

	public void selectMenu() {

		System.out.println("===================================");
		System.out.println("Java Menu System v1");
		System.out.println("-----------------------------------");

		System.out.println("1. 카트추가");
		System.out.println("2. 카트삭제");
		System.out.println("3. 카트리스트");
		System.out.println("Q. 끝내기");

		System.out.println("-----------------------------------");

		while (true) {
			System.out.print("선택 >> ");

			try {

				String strChoice = scan.nextLine();
				int intChoice = Integer.valueOf(strChoice);

				if (intChoice == 1) {
					System.out.println("카트추가");
					return;
				}
				if (intChoice == 2) {
					System.out.println("카트삭제");
					return;
				}
				if (intChoice == 3) {
					System.out.println("카트리스트");
					return;
				}
				if (strChoice == "Q") {
					System.out.println("끝내기");
					break;

				} else {
					System.out.println("1~3까지 입력하세요");
					continue;
				}

			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
			}

		}
	}

}

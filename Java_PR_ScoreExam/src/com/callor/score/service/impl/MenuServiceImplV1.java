package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.service.values.Values;

public class MenuServiceImplV1 implements MenuService {

	@Override
	public Integer selectMenu() {
		// TODO Auto-generated method stub

		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println(Values.dLine);
			System.out.println("학생 성적 입출력 시스템");
			System.out.println(Values.dLine);

			System.out.println("1. 학생 성적 점수 입력");
			System.out.println("2. 학생 성적 일람표 보기");
			System.out.println("QUIT 끝내기");
			System.out.println(Values.sLine);
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				System.out.println("시스템 종료");
				break;
			}
			try {
				Integer intMenu = Integer.valueOf(strMenu);

				if (intMenu >= 1 && intMenu <= 2) {
					return intMenu;
				} else {
					System.out.println("메뉴 선택은 1 ~ 2까지 정수로 입력해주세요");
				}

			} catch (Exception e) {
				System.out.println("메뉴 선택은 QUIT(끝내기), 1 ~ 2까지 정수만 입력할 수 있습니다");
			}
		}
		return null;

	}

}

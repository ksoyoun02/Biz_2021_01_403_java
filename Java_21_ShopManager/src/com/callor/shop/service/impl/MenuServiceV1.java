package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

//CartService interface를 implements 하기
public class MenuServiceV1 implements MenuService {

	private Scanner scan;

	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("=======================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("---------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("=======================================");

			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				break;
			}
			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				}else {
					System.out.println("업무 선택은 1 ~ 3까지 중에 선택하세요");
				}
			} catch (Exception e) {
				System.out.println("업무 선택은 QUIT(끝내기), 1 ~ 3까지 정수만 입력할 수 있습니다");
			}
		}
		return null;
	}

}

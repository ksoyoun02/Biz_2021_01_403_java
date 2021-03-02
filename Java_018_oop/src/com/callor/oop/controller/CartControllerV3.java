package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		// CartVO 객체를 담을 cartList 리스트를 생성
		List<CartVO> cartList = new ArrayList<CartVO>();
		Scanner scan = new Scanner(System.in);
		CartVO cartVO = new CartVO();

		// 키보드를 통해 카트에 추가할 "구매자이름", "상품명", "수량", "가격"을 입력받고
		// cartList에 추가 (3개의 상품을 추가)
		for (int i = 0; i < 3; i++) {
			int num = i + 1;

			cartVO = new CartVO();

			System.out.print(num + "번 구매자 이름 >> ");
			cartVO.setCartUserName(scan.nextLine());

			System.out.print(num + "번 상품명 >> ");
			cartVO.setCartPName(scan.nextLine());

			System.out.print(num + "번 수랑 >> ");
			String strQty = scan.nextLine();
			int intQty = Integer.valueOf(strQty);
			cartVO.setCartQty(intQty);

			System.out.print(num + "번 가격 >> ");
			String strQPrice = scan.nextLine();
			int intQPrice = Integer.valueOf(strQPrice);
			cartVO.setCartPrice(intQPrice);

			cartList.add(cartVO);

			System.out.println("=============================");
		}

		System.out.println("구매자이름\t상품명\t수량\t가격");
		System.out.println("--------------------------------");
		
		// cartList를 출력
		for (int i = 0; i < 3; i++) {

			cartVO = cartList.get(i);
			System.out.printf("%s\t\t%s\t%d\t%d\n", cartVO.getCartUserName(), cartVO.getCartPName(),
					cartVO.getCartQty(), cartVO.getCartPrice());
		}
	}
}
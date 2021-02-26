package com.callor.oop.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	CartVO cartVO = new CartVO();
	private List<CartVO> cartList = new ArrayList<CartVO>();

	public void inputCart() {

		Scanner scan = new Scanner(System.in);
		CartVO cartVO = new CartVO();

		System.out.print("구매자 >> ");
		String cartUserName = scan.nextLine();
		cartVO.setCartUserName(cartUserName);

		System.out.print("상품명 >> ");
		String cartPName = scan.nextLine();
		cartVO.setCartPName(cartPName);

		int cartQty = 0;
		while (true) {
			System.out.print("수량 >> ");
			String strcartQty = scan.nextLine();

			try {
				cartQty = Integer.valueOf(strcartQty);
				cartVO.setCartQty(cartQty);
				if (cartQty < 2) {
					System.out.println("수량은 2 이상 입력해주세요");
					continue;

				}
			} catch (Exception e) {
				System.out.println("반드시 숫자로 입력해주세요");
			}
			break;
		}

		int cartPrice = 0;
		while (true) {
			System.out.print("단가 >> ");
			String strcartPrice = scan.nextLine();

			try {
				cartPrice = Integer.valueOf(strcartPrice);
				cartVO.setCartPrice(cartPrice);

				if (cartPrice < 1000) {
					System.out.println("단가는 1000원 이상만 입력가능");
					continue;
				}
			} catch (Exception e) {
				System.out.println("반드시 숫자로 입력해주세요");

			}
			break;
		}

		cartList.add(cartVO);
	}

	public void printCartList() {

		System.out.println("===================================");
		System.out.println("구매자\t상품명\t수량\t단가");
		System.out.println("-----------------------------------");

		System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(0).getCartUserName(), cartList.get(0).getCartPName(),
				cartList.get(0).getCartQty(), cartList.get(0).getCartPrice());
	}

}

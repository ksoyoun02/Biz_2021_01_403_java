package com.callor.oop.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.CartList;
import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	private String cartUserName;
	private String cartPName;
	private int cartQty;
	private int cartPrice;

	public String getCartUserName() {
		return cartUserName;
	}

	public void setCartUserName(String cartUserName) {
		this.cartUserName = cartUserName;
	}

	public String getCartPName() {
		return cartPName;
	}

	public void setCartPName(String cartPName) {
		this.cartPName = cartPName;
	}

	public int getCartQty() {
		return cartQty;
	}

	public void setCartQty(int cartQty) {
		this.cartQty = cartQty;
	}

	public int getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}

	public void inputCart() {

		List<CartServiceV1> csV1List = new ArrayList<CartServiceV1>();

		Scanner scan = new Scanner(System.in);
		CartServiceV1 csV1 = new CartServiceV1();
		csV1 = new CartServiceV1();

		System.out.print("구매자 >> ");
		this.cartUserName = scan.nextLine();
		csV1.setCartUserName(this.cartUserName);

		System.out.print("상품명 >> ");
		this.cartPName = scan.nextLine();
		csV1.setCartPName(this.cartPName);

		int cartQty = 0;
		while (true) {
			System.out.print("수량 >> ");
			String strcartQty = scan.nextLine();

			try {
				int intcartQty = Integer.valueOf(strcartQty);
				csV1.setCartQty(intcartQty);
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
				this.cartPrice = Integer.valueOf(strcartPrice);
				csV1.setCartPrice(this.cartPrice);

				if (cartPrice < 1000) {
					System.out.println("단가는 1000원 이상만 입력가능");
					continue;
				}
			} catch (Exception e) {
				System.out.println("반드시 숫자로 입력해주세요");

			}
			break;
		}

		csV1List.add(csV1);
	}

	public void printCartList() {

		//CartServiceV1 csV1 = new CartServiceV1();

		System.out.println("===================================");
		System.out.println("구매자\t상품명\t수량\t단가");
		System.out.println("-----------------------------------");

		System.out.printf("%s\t%s\t%d\t%d\n", this.getCartUserName(), this.getCartPName(), this.getCartQty(), this.getCartPrice());
	}

}

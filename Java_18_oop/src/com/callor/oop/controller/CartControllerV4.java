package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();

		for (int i = 0; i < 3; i++) {

			// 제목보이기
			System.out.println("=============================");
			System.out.println("쇼핑카트 상품 추가");
			System.out.println("-----------------------------");

			// 입력받기
			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();

			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();

			/*
			 * 데어터를 키보드에서 입력받는 부분과 VO에 담아 리스트에 추가하는 부분을 분리하여 코딩할 경우 키보드에서 입력한 값을 정수변환하여 값을
			 * 담아둘 intQty변수를 while() 실행 이전에 선언해두어야 한다
			 */
			
			int intQty = 0;
			while (true) {
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();

				try {
					intQty = Integer.valueOf(strQty);
					if (intQty < 1) {
						System.out.println("수량은 1 이상의 정수만 입력가능");
						continue;
					}
				} catch (Exception e) {
					System.out.println("반드시 숫자로 입력해주세요");
				}
				break;
			}
			
			int intPrice = 0;
			while (true) {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();

				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000) {
						System.out.println("단가는 1000원 이상만 입력가능");
						continue;
					}
				} catch (Exception e) {
					System.out.println("반드시 숫자로 입력해주세요");
				}
				break;
			}

			// 카트 정보 생성
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);

			// 카트 정보 리스트에 추가하기
			cartList.add(cartVO);

		} // end for

		System.out.println("===================================");
		System.out.println("구매자\t상품명\t수량\t단가");
		System.out.println("-----------------------------------");

		// 배열에서는 배열.length 값을 '참조(읽으면)'하면
		// 배열의 개수를 알 수 있었다.
		// List 에서는 list.size() method를 '호출'하면
		// List 개수를 return 해준다

		int nSize = cartList.size();
		// ↓ 에 바로 cartList.size를 넣으면 계속 반복하면서 센다
		// 그래서 변수에 size값을 넣고 출력하면 더 효율적이다.
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(i).getCartUserName(), cartList.get(i).getCartPName(),
					cartList.get(i).getCartQty(), cartList.get(i).getCartPrice());
		}
		System.out.println("===================================");
	}

}

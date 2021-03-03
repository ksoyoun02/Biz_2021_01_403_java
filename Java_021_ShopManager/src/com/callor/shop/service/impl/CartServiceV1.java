package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

//CartService interface를 implements 하기
public class CartServiceV1 implements CartService {

	// 인스턴스 변수선언
	private List<CartVO> cartList;
	private Scanner scan;

	// 선언만 된 변수를 클래스 생성자에서 초기화
	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);

	}

	@Override
	// 장바구니에 상품담기
	public void inputCart() {

		System.out.println("=======================================");
		System.out.println("장바구니에 넣기");
		System.out.println("---------------------------------------");

		// 키보드에서 정보 받기
		System.out.print("구매자 >> ");
		String strUserName = scan.nextLine();

		System.out.print("상품명 >> ");
		String strProductName = scan.nextLine();

		int intPrice = 0;
		while (true) {
			System.out.print("단가 >> ");

			// 문자열로 받을때 오류가 덜 생김
			String strPrice = scan.nextLine();

			// 유효성검사
			try {
				intPrice = Integer.valueOf(strPrice);

				//             ↓ 0보다는 확실하게 1로 비교하는게 좋다.
				if (intPrice < 1) {
					System.out.println("단가는 1 이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로 입력해주세요");
			}
		}

		int intQty = 0;
		while (true) {

			System.out.print("수량 >> ");
			String styQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(styQty);
				if (intQty < 1) {
					System.out.println("수량은 1 이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로 입력해주세요");
			}
		} // for end

		// 입력받은 정보를 카트리스트에 추가
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intPrice * intQty);

		cartList.add(cartVO);
	}

	@Override
	// 장바구니 전체 리스트 보기
	public void printCart() {

		System.out.println("장바구니 리스트");
		System.out.println("=======================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("---------------------------------------");

		int intCount = 0;
		int totalPrice = 0;
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n", cartList.get(i).getUserName(), cartList.get(i).getProductName(),
					cartList.get(i).getPrice(), cartList.get(i).getQty(), cartList.get(i).getTotal());
			intCount++;
			totalPrice += cartList.get(i).getTotal();

		}

		System.out.println("합계\t" + intCount + "가지\t\t\t" + totalPrice);
	}

	@Override
	// 구매자별 장바구니 리스트 보기
	public void printuserCart() {

		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.print("이름 >> ");
		String userName = scan.nextLine();

		System.out.println(userName + " 장바구니 리스트");
		System.out.println("=======================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("---------------------------------------");

		int intCount = 0;
		int totalPrice = 0;

		// cartList에 저장된 값의 개수를 세어서 nSize에 저장
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {

			if (cartList.get(i).getUserName().equals(userName)) {

				System.out.printf("%s\t%s\t%d\t%d\t%d\n", cartList.get(i).getUserName(),
						cartList.get(i).getProductName(), cartList.get(i).getPrice(), cartList.get(i).getQty(),
						cartList.get(i).getTotal());

				intCount++;
				totalPrice += cartList.get(i).getTotal();

			}
		}
		System.out.println("---------------------------------------");
		System.out.println("합계\t" + intCount + "가지\t\t\t" + totalPrice);

	}

}

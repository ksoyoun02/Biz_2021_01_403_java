package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

//CartService interface를 implements 하기
public class CartServiceV2 implements CartService {

	// 인스턴스 변수선언
	private List<CartVO> cartList;
	private Scanner scan;

	// 선언하는 부분과 생성하는 부분을 분리하는 이유는 메모리 관리 때문!
	// 선언과 동시에 초기화해도 문법상 상관없음
	// 선언만 된 변수를 클래스 생성자에서 초기화
	public CartServiceV2() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);

	}

	@Override
	// 장바구니에 상품담기
	public void inputCart() {

		System.out.println("=======================================");
		System.out.println("장바구니에 넣기");
		System.out.println("---------------------------------------");

		System.out.print("구매자 >> ");
		// 키보드에서 정보를 받아 String변수인 strUserName에 저장
		String strUserName = scan.nextLine();

		System.out.print("상품명 >> ");
		String strProductName = scan.nextLine();

		// intPrice를 정수형 변수로 선언하고 초기화
		int intPrice = 0;
		while (true) {
			System.out.print("단가 >> ");

			// 키보드로 입력한 값을 문자열로 받을때 오류가 덜 생김! (정보 교환 시)
			String strPrice = scan.nextLine();

			// 유효성검사
			try {
				// 문자열로 입력받은 strPrice를 Integer형으로 형변환해서 변수 intPrice에 값을 저장
				intPrice = Integer.valueOf(strPrice);

				//               ↓ 0보다는 확실하게 1로 비교하는게 좋다.
				if (intPrice < 1) {
					System.out.println("단가는 1 이상 입력하세요");
					// continue를 써도 되지만 else입력이 더 코드를 단순하게 만든다, 굳이 코드를 길게 만들지 않도록 하기!
				} else {
					break; // 1이상 입력했을 경우! break 하고 빠져나온다
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
		}

		// cartVO로 CartVO를 초기화
		CartVO cartVO = new CartVO();
		// 입력받은 정보를 cartVO에 담기
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intPrice * intQty);

		// cartList에 입력받은 정보 추가
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
			// 값은 for문이 반복할때마다 1씩증가 -> count 세기
			intCount++;
			totalPrice += cartList.get(i).getTotal();

		}

		System.out.println("합계\t" + intCount + "가지\t\t\t" + totalPrice);
	}
 
	@Override
	// 구매자별 장바구니 리스트 보기
	public void printUserCart() {

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

			// 키보드로 입력한 userName값과 cartList.get(i).getUserName()값이 같을때만 결과를 출력
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

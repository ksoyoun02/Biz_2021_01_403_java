package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {

		// ProductVO 클래스를 사용하여 객체배열 5개를 선언
		ProductVO[] pVO = new ProductVO[5];
		
		Scanner scan = new Scanner(System.in);

		// 클래스로 선언한 객체 배열은 각각 요소를
		// 클래스의 생성자를 호출하여 인스턴스로
		// 만들어주는 절차가 "반드시" 필요하다
		for (int i = 0; i < pVO.length; i++) {

			pVO[i] = new ProductVO();

		}

		System.out.println("=============================");
		System.out.println("상품정보 등록(입력) 시스템 V2");
		System.out.println("-----------------------------");

		// 키보드를 통해 상품코드, 상품명, 거래처, 품목, 매입단가, 매출단가를 입력, 객체 배열에 저장
		for (int i = 0; i < pVO.length; i++) {

			int num = i + 1;

			System.out.println(num + "번 상품정보를 입력하세요");

			System.out.print("상품코드 >> ");
			pVO[i].strPCode = scan.nextLine();

			System.out.print("상품명 >> ");
			pVO[i].strPName = scan.nextLine();

			System.out.print("거래처 >> ");
			pVO[i].strDName = scan.nextLine();

			System.out.print("품목 >> ");
			pVO[i].strItem = scan.nextLine();

			System.out.print("매입단가 >> ");
			//문자열형숫자를 정수로 변경하여 저장
			String iPrice = scan.nextLine();
			pVO[i].iPrice = Integer.valueOf(iPrice);

			System.out.print("매출단가 >> ");
			String oPrice = scan.nextLine();
			pVO[i].oPrice = Integer.valueOf(oPrice);

		}

		// 저장된 결과 출력
		for (int i = 0; i < pVO.length; i++) {

			System.out.println(pVO[i].toString());

		}

	}
}

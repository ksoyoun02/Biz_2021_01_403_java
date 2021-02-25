package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {
	public static void main(String[] args) {

		// Q1 : ProductVO 클래스를 사용하여 객체, 인스턴스를 생성
		ProductVO pVO = new ProductVO();
		System.out.println("toString() :" + pVO.toString());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("-----------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("-----------------------------");
		
		// Q2 : 키보드를 통해 상품코드, 상품명....을 입력받아
		// 		객체의 인스턴스변수에 저장
		System.out.print("상품코드 >> ");
		pVO.strPCode = scan.nextLine();
		
		System.out.print("상품명 >> ");
		pVO.strPName = scan.nextLine();
		
		System.out.print("거래처 >> ");
		pVO.strDName = scan.nextLine();
		
		System.out.print("품목 >> ");
		pVO.strItem = scan.nextLine();
		
		System.out.print("매입단가 >>");
		pVO.iPrice = scan.nextInt();
		
		System.out.print("매출단가 >>");
		pVO.oPrice = scan.nextInt();
		
		pVO.toString();

	}
}
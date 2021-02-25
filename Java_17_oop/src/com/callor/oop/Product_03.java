package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ProductVO[] pVOs = new ProductVO[5];
		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}

		System.out.println("==============================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("==============================");

		for (int i = 0; i < pVOs.length; i++) {

			String pCode = (i + 1) + "";
			pVOs[i].strPCode = pCode;

			System.out.println(pCode + "번 상품정보 입력");
			System.out.print("상품이름 >> ");
			pVOs[i].strPName = scan.nextLine();

			System.out.print("거래처 >> ");
			pVOs[i].strDName = scan.nextLine();

			System.out.print("품목 >> ");
			pVOs[i].strItem = scan.nextLine();

			System.out.print("매입단가 >> ");
			String iPrice = scan.nextLine();
			pVOs[i].iPrice = Integer.valueOf(iPrice);
			
			// 매입단가, 매출단가는 0 미만값 입력할수 없도록 코드수정
			while(pVOs[i].iPrice < 0) {

				System.out.println("경고 : 0 미만값은 입력할 수 없다");
				System.out.println("다시 입력하세요");
				System.out.print("매입단가 >> ");
				String iPrice1 = scan.nextLine();
				pVOs[i].iPrice = Integer.valueOf(iPrice1);
			}

			System.out.print("매출단가 >> ");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);
			
			while(pVOs[i].oPrice < 0) {

				System.out.println("경고 : 0 미만값은 입력할 수 없다");
				System.out.println("다시 입력하세요");
				System.out.print("매출단가 >> ");
				String oPrice1 = scan.nextLine();
				pVOs[i].oPrice = Integer.valueOf(oPrice1);
			}

			pVOs[i].toString();

		}

	}

}

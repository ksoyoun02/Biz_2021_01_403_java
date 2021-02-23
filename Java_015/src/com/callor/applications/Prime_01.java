package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("2 이상의 정수를 입력하시오 >> ");
		int keyNum = scan.nextInt();

		for (int index = 2; index < keyNum; index++) {

			boolean bYes = keyNum % index == 0;

			if (bYes) {

				System.out.println("소수가 아니다");
				break;

			}

		}

		int pos = 0;
		for (pos = 2; pos < keyNum; pos++) {

			if (keyNum % pos == 0) {
				break;
			}

		}
		// pos의 값은?
		System.out.println(pos);
		// for 반복문이 중간에 break 되면
		// 		항상 pos < keyNum 관계가 된다
		
		// if(pos == keyNum) { 소수인경우 }
		
		// 조건문이 하늘이 무너져도 true인 경우를 먼저 찾아라
		if(pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아님");
			
			// for 반복문이 break 없이 모두 완료되었으면
		}else {
			System.out.println(keyNum + "는 소수");
		}
		

	}
}

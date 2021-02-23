package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		System.out.print("2 이상의 정수를 입력 >> ");
		int num = scan.nextInt();
		
		// int result 값 : -1 or num 위해 변수 생성
		int result = psV2.prime(num);

		// return 값 -1 : 소수가 아님
		if (result < 0) {
			System.out.println(num + "는 소수가 아님");
		} else { 
			// return 값 num : 소수
			System.out.println(num + "는 소수");

		}

	}
}

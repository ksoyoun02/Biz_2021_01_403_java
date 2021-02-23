package com.callor.applications.service;
// < int Num 값이 소수인지 아닌지 판별하는 코드 >
public class PrimeServiceV1 {

	// 정수 1개를 매개변수로 갖는 prime()method
	public void prime(int Num) {

		int pos = 0;
		for (pos = 2; pos < Num; pos++) {

			if (Num % pos == 0) {
				break;
			}
		}

		if (pos < Num) {
			System.out.println(Num + "는 소수가 아님");
		} else {
			System.out.println(Num + "는 소수");
		}

	}

}

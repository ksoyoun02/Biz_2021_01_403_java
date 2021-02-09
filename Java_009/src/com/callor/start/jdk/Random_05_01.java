//정답
package com.callor.start.jdk;

import java.util.Random;

/*
 * for(int i = 0 ; i < 100 ; i++)
 * Random 클래스를 이용
 * 
 * 1 ~ 100 까지 범위에서 임의의 숫자 100를 만들고
 * 100개 중에 짝수가 있으면 짝수들의 합을 계산
 */

public class Random_05_01 {
	public static void main(String[] args) {

		int intSum = 0;
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {

			int num = rnd.nextInt(100) + 1;
			boolean bYes = num % 2 == 0;

			if (bYes) {
				// num가 짝수이면 실행되는 부분
				// num 값을 다른 변수(sum)에 누적
				intSum += num;
				System.out.println(num);

			}
		} // for end
		System.out.println("짝수의 합 :" + intSum);
	}
}
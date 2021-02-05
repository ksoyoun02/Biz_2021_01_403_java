package com.callor.start.pay;

//가장많이사용하는코드
public class Pay_05 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;

	
		int sw = -1;
		
		//for는 시작하는값과 횟수가 정해질때!
		//while 횟수가 정해지지 않고 어떠한 조건에 의해 반복문을 수행하거나 종료할 필요가 있을때!
		/*
		 * 일반적으로 for() 반복문은
		 *   반복되는 횟수가 명확할때 사용
		 *   
		 * while(조건문) 반복문은
		 *   반복되는 횟수가 경우에 따라 다를때
		 *   조건을 부여하여 반복 수행을 결정한다.
		 *   조건문이 true 일때만 반복하고
		 *   조건문이 false 가 되면 종료한다.
		 */
		while (pay > 0) {

			int count = pay / paper;
			pay -= (paper * count);

			System.out.println(paper + "원권 : " + count);
			
			//if 가 2개면 둘다 출력하려고하는데
			//ir/ else이렇게 있으면 건너뛴다.
			if (sw < 0) { // sw가 0 보다 작으면
				paper = paper / 5;
			} else { // 그렇지 않으면
				paper = paper / 2;
			}

			sw *= (-1);
		}
	}

}

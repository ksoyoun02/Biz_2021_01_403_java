package com.callor.start.pay;

//가장많이사용하는코드
public class Pay_02 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;

	
		int sw = -1;
		for (; pay > 0;) {

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

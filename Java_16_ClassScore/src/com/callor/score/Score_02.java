package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		Random rnd = new Random();

		for (int i = 0; i < strName.length; i++) {

			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;

		}

		for (int i = 0; i < strName.length; i++) {

			ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);

		}
		for (int i = 0; i < strName.length; i++) {

			//ssV1.scoreAvg(intKor[i], intEng[i], intMath[i]);
		}
		
		System.out.println("======================================================");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름","국어","영어","수학", "총점", "평균");
		System.out.println("------------------------------------------------------");
		
		for (int i = 0; i < strName.length; i++) {

			//ssV1.scorePrint(intKor[i], intEng[i], intMath[i]);

		}
		System.out.println("------------------------------------------------------");
	}
}

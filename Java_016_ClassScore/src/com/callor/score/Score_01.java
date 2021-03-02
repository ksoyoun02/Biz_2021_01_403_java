package com.callor.score;

import java.util.Random;

public class Score_01 {
	
	public static void main(String[] args) {
		
		String[] stName = new String[] {"홍길동", "이몽룡", "성춘향","장녹수", "임꺽정"};
		String[] stHome = new String[] {"서울시", "익산시", "남원시", "한양시", "함흥시"};
		//String[] stClass = new String[] {"국어", "영어","수학"};
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
		int[] intScore = new int[5];
		int[] intSum = new int[5];
		float[] floAvg = new float[5];
		
		
		Random rnd = new Random();
	
		System.out.println("======================================================");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "이름","주소","국어","영어","수학", "총점", "평균");
		System.out.println("------------------------------------------------------");
		
		
		for(int i = 0 ; i < stName.length ; i++) {
			
			intKor[i] = rnd.nextInt(100)+1;
			intEng[i] = rnd.nextInt(100)+1;
			intMath[i] = rnd.nextInt(100)+1;
						
		}
		
		for(int i = 0 ; i < intScore.length ; i++) {
			
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
		}
		
		for(int i = 0 ; i < intScore.length ; i++) {
			
			floAvg[i] = (float)intSum[i] / 3;
			
		}
		
		
		for(int i = 0 ; i < stName.length ; i++) {
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n", stName[i], stHome[i], intKor[i], intEng[i], intMath[i], intSum[i], floAvg[i]);
		}
		
	}

}

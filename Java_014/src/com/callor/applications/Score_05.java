package com.callor.applications;

import java.util.Random;

public class Score_05 {
	
	public static void main(String[] args) {
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		String[] strName = new String[3];
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";
		
		Random rnd = new Random();
		
		
		int intSum = 0;
		float fAvg = 0f;
		
		for(int index = 0 ; index < intKor.length ; index++) {
			
			
			System.out.println(strName[index] + "의 점수");
			
			intKor[index] = rnd.nextInt(100)+1;
			System.out.println("국어점수 : " + intKor[index]);
			
			intEng[index] = rnd.nextInt(100)+1;
			System.out.println("영어점수 : " + intEng[index]);
			
			intMath[index] = rnd.nextInt(100)+1;
			System.out.println("수학점수 : " + intMath[index]);
			
		}
		
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		
		for(int index = 0 ; index < intKor.length ; index++) {
			intSum = (intKor[index] + intEng[index] + intMath[index]);
			fAvg = (float)intSum/3;
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[index], intKor[index], intEng[index], intMath[index], intSum, fAvg);
		}
		
		System.out.println("---------------------------------------------");
		
	
	}

}

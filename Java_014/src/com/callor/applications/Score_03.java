package com.callor.applications;

import java.util.Scanner;

public class Score_03 {
	public static void main(String[] args) {
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		String[] strName = new String[3];
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";
		
		Scanner scan = new Scanner(System.in);
		
		for(int index = 0 ; index < intKor.length ; index++) {
			
			System.out.println(strName[index] + "의 점수를 입력하세요");
			System.out.print("국어점수 >> ");
			intKor[index] = scan.nextInt();
			
			System.out.print("영어점수 >> ");
			intEng[index] = scan.nextInt();
			
			System.out.print("수학점수 >> ");
			intMath[index] = scan.nextInt();
			
		}
		
		System.out.println("====================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("------------------------------------");
		
		for(int index = 0 ; index < intKor.length ; index++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[index], intKor[index], intEng[index], intMath[index]);
		}
	
	}

}

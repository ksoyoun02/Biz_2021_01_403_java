package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* Prompt
		 * scanner의 nextInt() 를 사용하여
		 * 키보드 입력을 받는 코드가 실행되면
		 * 화면에 아무것도 없이
		 * 멈춘것처럼 보이는 현상이 있는데
		 * 미리 어떤 일을 할 것인지 알려주는 메세지
		 */
		
		System.out.print("국어점수를 입력하세요 >> ");
		
		/* Blocking 되었다. Code Blocking
		 * 
		 * 
		 */
		int intKor = scan.nextInt();
		
		System.out.print("영어점수를 입력하세요 >> ");
		int intEng = scan.nextInt();
		
		System.out.print("수학점수를 입력하세요 >> ");
		int intMath = scan.nextInt();
		
		System.out.println("==================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float fAve = intSum / 3.0f;
		//float fAvg = intSum / 3;
		//fAve = (float)intSum / 3;
		//fAve = intSum / 3.0f;
		//fAve = intSum /(float)3;
		
		System.out.print(intSum + "\t");
		System.out.println(fAve);
		System.out.println("==================================");
		
		

	}

}

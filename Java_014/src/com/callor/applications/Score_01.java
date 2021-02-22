package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		String[] strSubject = new String[3];
		strSubject[0] = "국어";
		strSubject[1] = "영어";
		strSubject[2] = "수학";

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		Scanner scan = new Scanner(System.in);

		System.out.println("각 과목의 성적을 입력하세요");

		
			System.out.print(strSubject[0] + " >> ");
			intKor[0] = scan.nextInt();
			intKor[1] = scan.nextInt();
			intKor[2] = scan.nextInt();
			
			System.out.println(strSubject[1] + " >> ");
			intEng[0] = scan.nextInt();
			intEng[1] = scan.nextInt();
			intEng[2] = scan.nextInt();
			
			System.out.println(strSubject[2] + " >> ");
			intMath[0] = scan.nextInt();
			intMath[1] = scan.nextInt();
			intMath[2] = scan.nextInt();
		
		

		System.out.println("국어\t 영어\t 수학\t");

		System.out.println("==============================");
		
		for(int i = 0; i < 3 ; i++) {
			
			System.out.printf("d%\td%\td%\n", intKor[i], intEng[i], intMath[i]);

		}

	}

}

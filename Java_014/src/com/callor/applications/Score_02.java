package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		String[] strName = new String[3];

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.print("학생이름입력 >> ");
			strName[i] = scan.nextLine();
			
			System.out.println(strName[i] + "의 점수입력");
			
			System.out.println("국어 >> ");
			intKor[i] = scan.nextInt();
			
			System.out.println("영어 >> ");
			intEng[i] = scan.nextInt();
			
			System.out.println("수학 >> ");
			intMath[i] = scan.nextInt();

		}
		
		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학\t");
		System.out.println("----------------------------");
		
		for (int index = 0 ; index < intKor.length ; index++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[index], intKor[index], intEng[index], intMath[index]);
		}
		System.out.println("----------------------------");

	}
}

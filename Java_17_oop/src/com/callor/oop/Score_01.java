package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		

		System.out.print("학생이름 >> ");
		sVO.strName = scan.nextLine();

		while (true) {

			System.out.print("국어성적 >> ");
			String intKor1 = scan.nextLine();
			int intKor = Integer.valueOf(intKor1);

			if (intKor < 50) {
				System.out.println("점수는 50 ~ 100 사이로 입력하세요");
			}
			if (intKor > 100) {
				System.out.println("점수는 50 ~ 100 사이로 입력하세요");

			} else {
				//sVO.intKor = intKor;
				break;
			}
		}

		while (true) {

			System.out.print("영어성적 >> ");
			String intEng1 = scan.nextLine();
			int intEng = Integer.valueOf(intEng1);

			if (intEng < 50) {
				System.out.println("점수는 50 ~ 100 사이로 입력하세요");
			}
			if (intEng > 100) {
				System.out.println("점수는 50 ~ 100 사이로 입력하세요");

			} else {
				//sVO.intEng = intEng;
				break;

			}

		}

		while (true) {

			System.out.print("수학성적 >> ");
			String intMath1 = scan.nextLine();
			int intMath = Integer.valueOf(intMath1);

			if (intMath < 50) {
				System.out.println("점수는 50 ~ 100 사이로 입력하세요");
			}
			if (intMath > 100) {
				System.out.println("점수는 50 ~ 100 사이로 입력하세요");
			} else {
				sVO.intMath = intMath;
				break;
			}

		}
	}
}

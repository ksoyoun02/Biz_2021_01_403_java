package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV2 {
	
	// 클래스로 객체 선언 및 초기화(생성)
	private Scanner scan = new Scanner(System.in);
	
	// 정수 및 실수형 변수 선언만!
	// 인스턴스 변수는 0으로 초기화 안해도 읽고 쓰기 가능!!!!!
	
	private String strName;
	
	private int intKor;
	private int intEng;
	private int intMath;
	
	private int intSum;
	private float floatAvg;
	
	public void input() {
		
		/*
		 * public String nextLing() {
		 * 		return 키보드에서 입력받은 문자열;
		 *  }
		 *  
		 * 키보드를 통해서 문자열을 입력받기 위해서는
		 * Scanner.nextLing() 메서드를 실행하고
		 * return 값을 문자열 변수에 저장한다.
		 */
		System.out.println("학생 이름을 입력하세요");
		System.out.print("이름 >> ");
		strName = scan.nextLine();
		
		System.out.println("각 과목의 점수를 입력하세요");
		
		/*
		 * public int nextInt(){
		 * 		return 키보드로 입력한 정수;
		 *  }
		 */
		System.out.print("국어점수 입력 >> ");
		intKor = scan.nextInt();
		
		System.out.print("영어점수 입력 >> ");
		intEng = scan.nextInt();
				
		System.out.print("수학점수 입력 >> ");
		intMath = scan.nextInt();
		
		
	}
	
	public void sum() {
		
	}
	
	public void avg() {
		
		
	}
	
	public void print() {
		
		System.out.printf("이름 : %s\n", strName);
		
		System.out.printf("국어 : %3d\n", intKor);
		System.out.printf("영어 : %3d\n", intEng);
		System.out.printf("수학 : %3d\n", intMath);
		System.out.printf("총점 : %3d\n", intSum);
		System.out.printf("평균 : %3.2f\n", floatAvg);
		
	}

}

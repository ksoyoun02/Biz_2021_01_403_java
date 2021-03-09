package com.callor.student;

public class Ex_01 {

	
	// public static void main(String args[]) {
	public static void main(String[] args) {

		// 두개의 정수를 변수에 담고 덧셈하여 출력하고
		int num1 = 0; // 0으로 클리어
		int num2 = 0;
		
		num1 = 50;
		num2 = 100;
		
		int sum = num1 + num2;
		System.out.println(sum);
		//end  두 수의 덧셈을 출력하는 코드
		
		int num3; // 변수가 초기화가 되지 않았기 때문에
		num3 = 100; // 생략하면
		System.out.println(num3); // 오류가 발생
		
		int num4 = 0;  //값을 얼마를 저장할지 모르겠으면 일단 초기화(clear) 한다
	}
}

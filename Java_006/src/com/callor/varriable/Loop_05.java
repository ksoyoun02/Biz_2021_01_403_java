package com.callor.varriable;

public class Loop_05 {
	
	public static void main(String[] args) {
		
		//메인 method넘어가면 변수사라짐
		int intDan = 7;
		
		for(int num = 1 ; num < 10 ; num += 1) {
			
		}
		
		//앞에 메인 method가 끝나고 선언한 num값이 소멸되었기 때문에 아래 명령어를 사용가능
		//↓ 1~9 까지 반복실행되는 명령문
		for(int num = 1 ; num < 10 ; num += 1) {
			
		}
		//22번출력
		for(int num = 20 ; num < 42 ; num += 1) {
			System.out.println("안녕");
			
		}
		//9번출력
	    //   시작하는값  비교하는값   증가하는값
		for(int num = 12 ; num <= 20 ; num += 1) {
			System.out.println("반가워");
		}

		for(int num = 12 ; num <= 20 ; num += 2) {
			System.out.println(num);
			//12 14 16 18 20
		}
	
	}

}

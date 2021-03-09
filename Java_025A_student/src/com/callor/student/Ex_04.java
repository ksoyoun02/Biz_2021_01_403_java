package com.callor.student;

import com.callor.student.model.StudentVO;

public class Ex_04 {
	
	public static void main(String[] args) {
		
		// 배열 10개를 선언
		StudentVO[] stdArray = new StudentVO[10];
		
		int index = 2;
		
		//배열 초기화하는 방법
			//1
		stdArray[index] = new StudentVO();
		
			//2
		for(int i = 0 ; i < stdArray.length ; i++) {
			stdArray[i] = new StudentVO();
		}
		
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 : " + stdArray[index].getStName());
		System.out.println("학번 : " + stdArray[index].getStNum());
		
		
		
	}

}


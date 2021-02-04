package com.callor.varriable;

public class Loop_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 정수형변수 num1의 값을 1씩 증가시키고(1,2,3,4...)
		 * 그 값을 Console에 출력하라.
		 */
		int num1 = 0;
		for (;;) {
			
			num1 += 1;
			System.out.println(num1);
			//2의 32승이 넘어가면 -값이 나옴
		}
	}

}

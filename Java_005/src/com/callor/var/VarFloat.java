package com.callor.var;

/*
 * 실수를 표현하기 2
 *  float : double 에 비해 저장공간이 절반, 정밀도가 낮음, 단정도실수
 *  float : 소수점자리 6번째까지 표시함.
 * 
 * 
 * 
 */
public class VarFloat {
	
	public static void main(String[] args) {
		
		//float num = 50.0; -> double 형
		
		/*
		 * float 형(단정도 실수형) 변수 num1을 선언하고
		 * float 형 값 50.0을 저장하라
		 * 이때 숫자값에는 F(f)를 붙여야한다.
		 */
		
		float num1 = 50.0F;
		float num2 = 50.111111111f;
		System.out.println(num1);
		System.out.println(num2);
		
		
	}

}

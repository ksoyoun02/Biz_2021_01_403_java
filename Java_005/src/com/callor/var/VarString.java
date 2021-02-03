package com.callor.var;

/*
 * 문자열형 변수
 * String
 * 
 * 중요!!
 *     정수 : int 실수 : float 문자열 : String
 * 
 * 변수사용 
 *    -> 저장장소 효율적으로 사용위해
 *    -> 코드를 변경해야하는 경우 최소한으로 변경하기위해
 */

public class VarString {
	
	public static void main(String[] args) {
		
		String str1 = "Korea";
		String str2 = "대한민국";
		
		String str3 = " Of";
		String str4 = " Korea";
		String str5 = " 우리나라";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str3 + str4);
		System.out.println(str2 + str5);
	}

}

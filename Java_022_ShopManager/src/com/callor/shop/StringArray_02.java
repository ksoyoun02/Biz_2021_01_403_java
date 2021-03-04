package com.callor.shop;

public class StringArray_02 {
	
	public static void main(String[] args) {
		
		// 각자의 문자열을 : 으로 구분
		String strCart = "홍길동:초코파이:10:1000";
		
		/*
		 * 원래문자열.split(구분자문자열)
		 * 
		 * 	원래 문자열을 구분자 문자열을 기준으로 나누고
		 * 	문자열 배열로 만들어 return 한다
		 */
		
		// :을 기분으로 나누어서 저장해라 (문자열을 분해)
		// 배열 4개를 만든다음 cartList에 담는다
		String[] cartList = strCart.split(":"); //{"홍길동","초코파이"
		
	
		for(String s : cartList) {
			System.out.println(s);
		}
		
		// 글자 개수 한개한개를 분해해서 배열로 만들어라
		/*
		 * strCart에 담긴 문자열을 글자 단위로 잘라서
		 * 배열에 담아달라
		 */
		cartList = strCart.split("");
		for(String s : cartList) {
			System.out.println(s);
		}
		
		
		/*
		 * 지정된 형식(폼)으로 문자열을 만들어서
		 * return 해주는 method
		 */
		
		// printf는 출력만 가능
		// String.format은 문자열로 만들어서 변수에 담을수있음
		//                  ↓ static method : 바로 쓸수있음
		strCart = String.format("%d:%d:%d", 10,20,30);
		System.out.println(strCart);
		
		// strCart변수에 담긴 문자열 중에 20이라는 문자열이 있으면 대한민국이라는 문자열로 바꾸어서 return하라
		// "strCart 배열 중에서 혹시 "20"이라는 값이 있으면 "대한민국"으로 바꾸어라"
		strCart = strCart.replace("20", "대한민국");
		System.out.println(strCart);
		
		// white spcae가 생김
		String strName = "홍  길 동  ";
		System.out.println(strName);
		
		// 문자열 중에 공백을 모두 제거하기
		// white space를 없애는 명령문
		strName = strName.replace(" ", "");
		System.out.println(strName);
		
		strName = "나는 자랑스러운 태극기 앞에";
		// 9번째부터 그 뒤로 있는 문자열만 잘라라
		String strFlag = strName.substring(9);
		System.out.println(strFlag);
		
		// 9번째부터 12번째까지 잘라라
		// 길이가 정해져 있는 경우에만 사용 아닌 경우에는 split사용
		strFlag = strName.substring(9,12);
		System.out.println(strFlag);
	}

}

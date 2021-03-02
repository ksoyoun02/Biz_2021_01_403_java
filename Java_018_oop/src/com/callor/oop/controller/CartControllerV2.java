package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		// CartVO 클래스를 사용하여 객체배열 3개 선언
		CartVO[] cartVO = new CartVO[3];
		
		// 선언된 객체배열을 초기화
		for(int i = 0 ; i < cartVO.length ; i++) {
			cartVO[i] = new CartVO();
		}
		
		// 객체배열 3개에 임의의 카트정보를 저장
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("10:52:00");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartQty(5);
		cartVO[0].setCartStd("초코맛");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartTotal(1000 * 5);
		
		cartVO[1].setCartUserName("성춘향");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("10:55:00");
		cartVO[1].setCartPName("감자칩");
		cartVO[1].setCartQty(5);
		cartVO[1].setCartStd("양파맛");
		cartVO[1].setCartPrice(1500);
		cartVO[1].setCartTotal(1500 * 5);
		
		cartVO[2].setCartUserName("이몽룡");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("10:56:00");
		cartVO[2].setCartPName("사탕");
		cartVO[2].setCartQty(5);
		cartVO[2].setCartStd("레몬맛");
		cartVO[2].setCartPrice(200);
		cartVO[2].setCartTotal(200 * 5);
		
		// 저장된 카트정보를 리스트로 출력
		for(int i = 0 ; i < cartVO.length; i++) {
			System.out.println(cartVO[i].toString());
		}
		
		// === cartVO의 개수가 3인 상태
		// 상품 한가지를 더 카트에 넣고싶다
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPName("바나나우유");
		
		System.out.println("=====================");
		System.out.println("카트내용");
		System.out.println("=====================");
		
		for(int i = 0 ; i < cartVO.length ; i ++) {
			
			System.out.println(cartVO[i].toString());
		}
		
		
		
		
	}
}
package com.callor.shop.service;

public interface CartService {

	// 인터페이스 만들기
	// interface : 클래스를 구현하기 위한 설계도 역할
	
	// 장바구니 상품담기
	public void inputCart();
	
	// 장바구니 전체리스트
	public void printCart();
	
	// 구매자별 장바구니 리스트
	public void printUserCart();
}

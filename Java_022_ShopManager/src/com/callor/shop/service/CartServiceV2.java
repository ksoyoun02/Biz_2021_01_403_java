package com.callor.shop.service;

// CartService의 method에 추가하겠다
public interface CartServiceV2 extends CartService {
	

	public void saveCartToFile();
	public void loadCartFromFile();
	
	
}

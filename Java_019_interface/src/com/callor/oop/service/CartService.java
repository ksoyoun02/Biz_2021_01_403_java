package com.callor.oop.service;


/*
 * project에서 interface를 만드는 이유
 *  1. 앞으로 CartServic** 클래스를 만들때는
 *  	반드시 CartSErvice interface를 implements하라
 *  
 */
public interface CartService {
	
	public void inputCart();
	public void printCart();

}

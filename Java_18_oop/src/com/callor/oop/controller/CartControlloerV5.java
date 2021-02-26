package com.callor.oop.controller;

import java.util.Scanner;

import com.callor.oop.Service.CartServiceV1;

public class CartControlloerV5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		CartServiceV1 csV1 = new CartServiceV1();
		
		csV1.inputCart();
		csV1.printCartList();
	}

}

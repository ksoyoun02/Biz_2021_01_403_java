package com.callor.applications.service;

public class ClassServiceV1 {

	/*
	 * Java 코딩을 할때
	 * {} 내에서 같은 이름의 변수느 2번 이상 선언 불가
	 * class {} 내에서 같은 이름의 메서드는 2번이상 선언불가
	 * 
	 * 하지만 Java에서는 메서드의 매개변수 개수, 타입이 다르면
	 * 같은 이름의 메서드를 중복하여 선언할 수 있다
	 */
	public void sum(int num1, int num2) {
		
	}
	public void sum(int num1, float num2) {
		
	}
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);

	}

	public void add(int num1, float num2) {
		System.out.println(num1 + num2);

	}

	public void add(double num1, float num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}

}

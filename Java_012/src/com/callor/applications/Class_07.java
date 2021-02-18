package com.callor.applications;

import com.callor.applications.service.ClassServiceV5;

public class Class_07 {

	public static void main(String[] args) {

		ClassServiceV5 csV5 = new ClassServiceV5();
		
		int num1 = 3;
		long num2 = 3;
		
		float num3 = 3.0F;
		num3 = (float)3.0;
		double num4 = 3.0;
		
		float result = csV5.sum(55.2f, 33.7f);
		
		System.out.println(result);
	}
}
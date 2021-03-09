package com.callor.student;

public class Ex_03 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
	
			int num = i + 1;
			intSum += num;
		}
		System.out.println("1 ~ 100까지 덧헴한 결과 = " + intSum);
		
	}

}

package com.callor.student;

/*
 * ==============================
 * 구구단 7단
 * ------------------------------
 * 7 x 1 = 7
 * 7 x 2 = 
 * 7 x 3 = 
 * 7 x 4 = 
 * 7 x 5 = 
 * 7 x 6 = 
 * 7 x 7 = 
 * 7 x 8 = 
 * 7 x 9 = 
 * ==============================
 */
public class Ex_10 {
	
	public static void main(String[] args) {
		
		int dan = 7;
		System.out.println("=================================");
		System.out.println("구구단" + dan + "단");
		System.out.println("---------------------------------");
		
		for(int i = 1 ; i < 10 ; i ++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
	
		}
		System.out.println("=================================");
	}
	

}

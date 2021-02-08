package com.callor.start;

public class Multiple_02 {

	public static void main(String[] args) {
		
		int intM = 0;
		for(int i = 0 ; i < 100 ; i++){
			
			int num = (i + 7);
			boolean bYes = num % 3 > 0;  
		
			if (bYes) {
				
				intM += num;
			}
		}
		System.out.println(intM);
	}
}

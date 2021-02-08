package com.callor.start;

public class Odd_Even_00 {

	public static void main(String[] args) {
		
		int intsum = 0;
		
		for(int i = 0; i < 100 ; i++) {
			
			if( (i+1) % 2 == 0 ) {
				
				int num = i+1;
				intsum += num;
					
			}
		}
			System.out.println("1~100까지 짝수들의 합 : " + intsum);
		
			
		intsum = 0;
		
		for(int i = 0; i < 100 ; i++) {
			
			if( i % 2 == 1 ) {
				
				int num = i;
				intsum += num;
			}
		}
			System.out.println("1~100까지 홀수들의 합 : " + intsum);
			
			
		
			
			
		
	}
}

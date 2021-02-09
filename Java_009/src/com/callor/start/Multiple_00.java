package com.callor.start;

public class Multiple_00 {

	public static void main(String[] args) {
		
		int intsum = 0;
		for(int i = 0; i < 100 ; i++) {
			
			int num = i + 1;
			boolean bYes = num % 3 == 0;
			boolean bYes1 = num % 9 == 0;
			
			if (bYes && bYes1)
			{
				System.out.println(num + "는 3의 배수이면서, 9의 배수");
	
				intsum += num;
			}
			
		}
		System.out.println(intsum + "는 3의 배수이면서, 9의 배수인 수 들의 합");
	}
}

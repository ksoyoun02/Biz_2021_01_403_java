package com.callor.start;

//for() 반복 명령문, if() 비교연산 명령문을 사용하여 다음 문제를 풀이하시오
  // - 7 ~ 107 까지 범위 수 중에서 3의 배수들을 보이고 그 합을 구하시오

public class Multiple_01 {
	
	public static void main(String[] args) {
		
		
		int intsum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			
			boolean bYes = ( i + 7 ) % 3 == 0;
			
			if(bYes) {
				
                int num = ( i + 7 );
				System.out.println(num);
				intsum += num;
			}
			
		}
		System.out.println(intsum);
	}

}

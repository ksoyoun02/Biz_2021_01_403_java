package com.callor.applications;

public class Numbers_02 {
	
	public static void main(String[] args) {
		int intNum1 = 33;
		int intNum2 = 77;
		
		System.out.printf("num1 : %d, num2 : %d", intNum1, intNum2);
		
		// 1. (임시)로 사용할 intTemp를 만들고
		// 2. num1 변수값을 복사해둔다(백업)
		//      33을 Temp에 복사
		//		temp == 33
		int intTemp = intNum1;
		
		// 3. num1변수에 num2의 값을 복사
		//   num1 == num2 상태가 된다.
		// 		77을 num1에 복사
		//		num1은 77로 변경
		intNum1 = intNum2;
		
		// 4. 임시로 (temp == 33)에 백업해둔 num1의 값을
		//		temp == 33
		//   num2에 복사
		//		num2 == 33
		intNum2 = intTemp;
		
		// 5. num1과 num2의 값이 서로 바뀐다.
		// 변수값의 swap 코드
		
		intTemp = intNum1;
		intNum1 = intNum2;
		intNum2 = intTemp;
		
		
	}

}

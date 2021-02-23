package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int keyNum = 0;
		int lastpos = 0;
		
		for(int i = 0 ; i < intNums.length ; i++) {
			
			intNums[i] = rnd.nextInt(100)+1;
		}
		
		/*
		 * 변수는 앞에서 어떤 값을 저장했던 상관없이
		 * 가장 마지막에 저장한 값만 가지고 있다.
		 */
		
		System.out.print("1 ~ 10 까지 중 정수 입력 >> ");
		keyNum = scan.nextInt();
		
		for (int i = 0; i < intNums.length; i++) {

			boolean bYes = intNums[i] == keyNum;

			if (bYes) {
				
				// 키보드로 입력한 값이 일치할때마다
				// 그 위치를 lastpos에 저장한다.
				lastpos = i;
			}
		}
		// 여기오면 lastpos에 저장된 값은
		// 가장 마지막으로 lastpos = i이 실행된
		// 결과만 담고있다.
		System.out.println("intNumbs의 몇번째에서 가장 마지막으로 나타나는 가? >> " + lastpos + "번째");
		
	}

}

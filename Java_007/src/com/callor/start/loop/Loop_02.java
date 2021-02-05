package com.callor.start.loop;

public class Loop_02 {

	public static void main(String args[]) {
		
		
		//for 안의 변수 : for문이 사라지면 변수값도 사라짐, 임시변수
		for(int i = 0 ; i < 10 ; i += 1) {		
		}
		
		int num = 0;
		num = num + 1;
		num += 1;
		num =+ 1; //이 코드는 사용하지 말것 (java 버전에 따라 오류생길 가능성-)
		//↑ 값을 계속 쌓아간다 -> 누적연산
		
		//↓ num 라는 변수를 1 증가시켜라
		num++; //단항연산자
		++num;
		
		num = num - 1;
		num -= 1;
		num--;
		--num;
		
		//보편적으로 사용하는 for문 형식
		//(1) 시작값
		//(2) 비교문 (보통 등호를 사용하지않는다)
		//(3) i값을 어떻게 변화시킬것인가 (1씩증가하자)
		for (int i = 0 ; i < 10 ; i++) {
			// (1)         (2)     (3)
		}
		
		// i값이 100부터 시작하여 i < 0까지 
		// 1씩 감소하면서 반복한다.
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}
}

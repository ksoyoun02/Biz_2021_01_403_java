package com.callor.start.loop;

public class While_03 {
	
	public static void main(String[] args) {
		
		//3의 배수인지 찾는 명령문
		int index = 0;
		while(true) {
			
			//할 수는있지만 좋은 코드가 아님, 내가원하는건 3의 배수인지 찾는것이기 떄문
			//매우 불편한 코드
			if(index % 3 > 0) {
				System.out.println("3의 배수가 아님");
			}
			
			//정상적인코드
			//무조건 == 이 0이여야만 하니까 사용가능
			if(++index % 3 ==0) {
				System.out.println(index + "는 3의 배수");
			} else {
				System.out.println(index + "는 3의 배수아님");
			}
			
			//index == 999는 중단이 될수도/안될수도있음, 무조건 정수라는 조건이 있어야함.
		    //무조건 결과가 나오는 경우 제외하고는 ==을 쓰지않는다!
			if(index > 1000)
				break;
			
		}
	}

}

package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

// MenuService 인터페이스를 implemetns하기
public class MenuServiceImplV1 implements MenuService {

	@Override
	public Integer selectMenu() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();

			// "QUIT"인 경우 반복문을 중단하고 null 값을 return
			if (strMenu.equals("QUIT")) {
				break;
			}
			
			// 유효성 검사
			try {
				// 문자열 strMenu를 Integer형으로 형변환
				Integer intMenu = Integer.valueOf(strMenu);
				
				// intMenu 값이 1 ~ 3 사이 일 경우 그 값(intMenu)을 그대로 return
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else { // 1 ~ 3 이외의 값을 경우 경고문을 출력하고 다시 while문 반복
					System.out.println("메뉴 선택은 1 ~ 3까지 정수로 입력해주세요");
				}

			} catch (Exception e) { 
				System.out.println("메뉴 선택은 QUIT(끝내기), 1 ~ 3까지 정수만 입력할 수 있습니다");
			}

		}

		return null;
	}

}

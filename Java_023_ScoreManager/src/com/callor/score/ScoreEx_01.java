package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

/*
 * Q : 
 * 		1. MenuService, ScoreService 인터페이스를 생성
 * 		2. 인터페이스 implements하여 클래스 생성
 * 		3. 20명 학생의 5과목 성적처리
 * 		4. 각 과목의 점수는 1 ~ 100 까지 난수 값으로 생성
 * 		5. 학생 점수를 생성한 후 파일에 저장
 * 		6. 파일에서 학생 점수를 읽어 총점, 평균 계산 후 성적 리스트 출력
 */

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1();
		
		while(true) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) {
				break;
			}else if(menuItem == 1) {
				sService.makeScore();
			}else if(menuItem == 2) {
				sService.saveScoreToFile();
			}else if(menuItem == 3) {
				sService.loadScoreFrom();
			}
			
		}
		
	}

}

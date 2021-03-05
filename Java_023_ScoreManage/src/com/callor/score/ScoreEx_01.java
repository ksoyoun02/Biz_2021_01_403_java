package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

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

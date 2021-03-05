package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.impl.MenuServiceImplV1;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		
		mService.selectMenu();
	}

}

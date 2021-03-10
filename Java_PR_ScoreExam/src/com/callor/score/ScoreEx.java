package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {

	public static void main(String[] args) {

		MenuService msV1 = new MenuServiceImplV1();
		ScoreService ssV1 = new ScoreServiceImplV1();

		while (true) {
			Integer menuItem = msV1.selectMenu();

			if (menuItem == null) {
				break;
			} else if (menuItem == 1) {
				ssV1.inputScore();
				ssV1.saveScoreToFile();

			} else if (menuItem == 2) {

				ssV1.loadScoreFromFile();
				ssV1.totalAndAvg();
				ssV1.printScore();
			}

		}
	}

}

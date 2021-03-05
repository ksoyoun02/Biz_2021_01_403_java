package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	private List<ScoreVO> scoreVO;
	
	public ScoreServiceImplV1() {
		scoreVO = new ArrayList<ScoreVO>();
	}
	
	@Override
	public void makeScore() {
		Random rnd = new Random();
		
		
		for(int i = 0 ; i < 20 ; i++) {
			
			scoreVO.get(i).setKor(rnd.nextInt(100)+1);
			scoreVO.get(i).setEng(rnd.nextInt(100)+1);
			scoreVO.get(i).setMath(rnd.nextInt(100)+1);
			scoreVO.get(i).setMusic(rnd.nextInt(100)+1);
			scoreVO.get(i).setHistory(rnd.nextInt(100)+1);
					
		}
		
		
	}

	@Override
	public void saveScoreToFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadScoreFrom() {
		// TODO Auto-generated method stub

	}

}

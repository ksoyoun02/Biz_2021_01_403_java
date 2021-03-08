package com.callor.score.files;

import com.callor.score.service.impl.ScoreServiceImplV1;

public class FileWriter_01 {

	public static void main(String[] args) {
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		
		ssV1.makeScore();
		ssV1.saveScoreToFile();
	}
}

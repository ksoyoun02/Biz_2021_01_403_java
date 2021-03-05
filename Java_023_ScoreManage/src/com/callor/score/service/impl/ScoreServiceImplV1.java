package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	private List<Integer> intList;
	private String scoreFile;

	public ScoreServiceImplV1() {

		intList = new ArrayList<Integer>();
		scoreFile = "src/com/callor/score/files/nums_rnd.txt";

	}

	@Override
	public void makeScore() {
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);
		}

	}

	@Override
	public void saveScoreToFile() {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(scoreFile);
			printer = new PrintWriter(fileWriter);

			int nSize = intList.size();
			for (int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);

				printer.print(n + ":");

				if ((i + 1) % 5 == 0) {
					printer.println();
				}
			}

			printer.close();
			fileWriter.close();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Override
	public void loadScoreFrom() {
		// TODO Auto-generated method stub

	}

}

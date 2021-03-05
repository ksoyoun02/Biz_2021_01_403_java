package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	
	// save, load method가 공용으로 사용할 객체
	private List<Integer> intList;
	private String scoreFile;

	public ScoreServiceImplV1() {

		intList = new ArrayList<Integer>();
		scoreFile = "src/com/callor/score/files/nums_rnd.txt";

	}

	@Override
	public void makeScore() {
		// Random 수를 생성하여 List에 담을 method
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);
		}

	}

	@Override
	public void saveScoreToFile() {
		// List에 담긴 숫자들을 파일에 저장하는 mehtod
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

		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String str = buffer.readLine();
				if (str == null) {
					break;
				}
				strLines.add(str);
			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String str : strLines) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setHistory(Integer.valueOf(scores[3]));
			scoreVO.setMusic(Integer.valueOf(scores[4]));
			scoreList.add(scoreVO);
		}

		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		System.out.println(Values.dLine);
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			int num = i + 1;
			System.out.print(num + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");

		}
		System.out.println(Values.dLine);

	}
}

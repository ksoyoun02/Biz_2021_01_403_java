package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private Scanner scan;
	private String fileName;
	private List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {

		scan = new Scanner(System.in);
		fileName = "src/com/callor/score/score.txt";
		scoreList = new ArrayList<ScoreVO>();

	}

	@Override
	public void inputScore() {

		System.out.println(Values.dLine);
		System.out.println("학생의 성적정보를 입력하세요");
		System.out.println(Values.dLine);

		System.out.print("학번 >> ");
		String stNum = scan.nextLine();
		int intNum = Integer.valueOf(stNum);
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setStNum(intNum);

		int sSize = scoreList.size();
		for (int i = 0; i < sSize; i++) {

			if (intNum == scoreList.get(i).getStNum()) {
				System.out.println("이미 입력한 값이다");
				System.out.println("다시 입력하세요");
				return;

			} else {
				continue;
			}

		}

		int intKor = 0;
		while (true) {
			System.out.print("국어 >> ");
			String stKor = scan.nextLine();

			try {
				intKor = Integer.valueOf(stKor);

				if (intKor < 0 || intKor > 100) {
					System.out.println("국어 점수는 0 ~ 100점 범위 내에서 입력해주세요");

				} else {
					break;
				}

			} catch (Exception e) {
				System.out.println("점수는 숫자로만 입력해주세요");
			}
		}

		int intEng = 0;
		while (true) {
			System.out.print("영어 >> ");
			String stEng = scan.nextLine();
			try {
				intEng = Integer.valueOf(stEng);

				if (intEng < 0 || intEng > 100) {
					System.out.println("수학 점수는 0 ~ 100점 범위 내에서 입력해주세요");

				} else {
					break;
				}

			} catch (Exception e) {
				System.out.println("점수는 숫자로만 입력해주세요");
			}
		}

		int intMath = 0;
		while (true) {
			System.out.print("수학 >> ");
			String stMath = scan.nextLine();

			try {
				intMath = Integer.valueOf(stMath);

				if (intMath < 0 || intMath > 100) {
					System.out.println("영어 점수는 0 ~ 100점 범위 내에서 입력해주세요");

				} else {
					break;
				}

			} catch (Exception e) {
				System.out.println("점수는 숫자로만 입력해주세요");
			}
		}
		int intMusic = 0;
		while (true) {
			System.out.print("음악 >> ");
			String stMusic = scan.nextLine();
			try {
				intMusic = Integer.valueOf(stMusic);

				if (intMusic < 0 || intMusic > 100) {
					System.out.println("음악 점수는 0 ~ 100점 범위 내에서 입력해주세요");

				} else {
					break;
				}

			} catch (Exception e) {
				System.out.println("점수는 숫자로만 입력해주세요");
			}
		}

		int intSum = intNum + intKor + intEng + intMath + intMusic;
		float floAvg = (float) intSum / 4;
		scoreVO.setStKor(intKor);
		scoreVO.setStEng(intEng);
		scoreVO.setStMath(intMath);
		scoreVO.setStMusic(intMusic);
		scoreVO.setStSum(intSum);
		scoreVO.setStAvg(floAvg);

		scoreList.add(scoreVO);

	}

	@Override
	public void saveScoreToFile() {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			PrintWriter printer = new PrintWriter(fileWriter);

			for (ScoreVO vo : scoreList) {
				printer.print(vo.getStNum() + ",");
				printer.print(vo.getStKor() + ",");
				printer.print(vo.getStEng() + ",");
				printer.print(vo.getStMath() + ",");
				printer.print(vo.getStMusic() + ",");
				printer.print(vo.getStSum() + ",");
				printer.print(vo.getStAvg() + "\n");
			}

			printer.close();
			fileWriter.close();
			// System.out.println("파일 저장 성공");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("파일 생성 중 문제 발생");
		}

	}

	@Override
	public void loadScoreFromFile() {
		// TODO Auto-generated method stub
		scoreList.removeAll(scoreList);

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				String[] scores = reader.split(",");

				ScoreVO sVO = new ScoreVO(Integer.valueOf(scores[0]), Integer.valueOf(scores[1]),
						Integer.valueOf(scores[2]), Integer.valueOf(scores[3]), Integer.valueOf(scores[4]),
						Integer.valueOf(scores[5]), Float.valueOf(scores[6]));

				scoreList.add(sVO);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제발생");
		}

	}

	@Override
	public void totalAndAvg() {
		// TODO Auto-generated method stub

		for (ScoreVO vo : scoreList) {
			int sum = vo.getStKor();
			sum += vo.getStEng();
			sum += vo.getStMath();
			sum += vo.getStMusic();

			float avg = (float) sum / 4;

			vo.setStSum(sum);
			vo.setStAvg(avg);
		}
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		this.totalAndAvg();

		System.out.println(Values.dLine);
		System.out.println("성적일람표");
		System.out.println(Values.dLine);
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine);

		int totalKorSum = 0;
		int totalEngSum = 0;
		int totalMathSum = 0;
		int totalMusicSum = 0;
		int totalSum = 0;
		float totalKorAvg = 0;
		float totalEngAvg = 0;
		float totalMathAvg = 0;
		float totalMusicAvg = 0;
		float totalAvg = 0;
		float avgSum = 0;

		for (ScoreVO vo : scoreList) {
			System.out.printf("%05d\t", vo.getStNum());
			System.out.print(vo.getStKor() + "\t");
			System.out.print(vo.getStEng() + "\t");
			System.out.print(vo.getStMath() + "\t");
			System.out.print(vo.getStMusic() + "\t");
			System.out.print(vo.getStSum() + "\t");

			System.out.printf("%3.2f\n", vo.getStAvg());
			totalKorSum += vo.getStKor();
			totalEngSum += vo.getStEng();
			totalMathSum += vo.getStMath();
			totalMusicSum += vo.getStMusic();
			totalSum += vo.getStSum();
			avgSum += vo.getStAvg();

		}
		int nSize = scoreList.size();
		totalKorAvg = (float) totalKorSum / nSize;
		totalEngAvg = (float) totalEngSum / nSize;
		totalMathAvg = (float) totalMathSum / nSize;
		totalMusicAvg = (float) totalMusicSum / nSize;
		totalAvg = (float) avgSum / nSize;

		System.out.println(Values.sLine);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", "총점:", totalKorSum, totalEngSum, totalMathSum, totalMusicSum,
				totalSum);
		System.out.printf("%s\t%3.2f\t%3.2f\t%3.2f\t%3.2f\t\t%3.2f\n", "평균:", totalKorAvg, totalEngAvg, totalMathAvg,
				totalMusicAvg, totalAvg);
		System.out.println(Values.dLine);
	}

}

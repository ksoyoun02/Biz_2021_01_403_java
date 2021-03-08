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

// ScoreService 인터페이스를 implements 하기
public class ScoreServiceImplV1 implements ScoreService {

	
	// save, load method가 공용으로 사용할 객체
	// private으로 변수를 선언만 함
	private List<Integer> intList;
	private String scoreFile;

	// 선언만 한 변수를 생성자에서 초기화
	public ScoreServiceImplV1() {

		intList = new ArrayList<Integer>();
		scoreFile = "src/com/callor/score/files/nums_rnd.txt";

	}

	// Random 수를 생성하여 List에 담을 method
	@Override
	public void makeScore() {
		
		// Random 클래스는 makeScore method에서만 사용하기때문에 이 method안에서 선언
		Random rnd = new Random();
		
		// 100명의 학생의 1 ~ 100 사이의 random 점수를 생성하고
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			// 그 값을 intList에 저장
			intList.add(num);
		}

	}

	// List에 담긴 숫자들을 파일에 저장하는 mehtod
	@Override
	public void saveScoreToFile() {
		
		// 파일에 데이터를 저장하기 위해 2개의 클래스를 객체로 선언
		// 클래스를 사용할 객체 선언과 객체 선언 부분을 분리해야 한다
		// 		=> 객체를 생성할때, 사용할때 try - catch가 의무 적용되어야 하기 때문에
		//			코드 작성 편의상 분리하는 것이좋다.
		//			+ 클래스일 경우 null값으로 초기화!!
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {

			// fileWriter 객체 생성 
			// 운영체제와 통신을 연결시도
			fileWriter = new FileWriter(scoreFile);
			
			// fileWriter를 PrintWriter와 연결
			printer = new PrintWriter(fileWriter);

			// intList의 List에 담긴 값의 개수를 세서 변수 nSize값에 저장
			int nSize = intList.size();
			
			for (int i = 0; i < nSize; i++) {
				
				// intList의 i번째 부터 nSize번째 까지 저장된 값을
				// Integer n 변수에 저장
				Integer n = intList.get(i);

				// : 으로 값을 구분하여 출력
				printer.print(n + ":");

				// 1 ~ 5 값, 6 ~ 10 값 사이에
				// 한 줄을 추가하여 다음 줄로 넘어갈 수 있도록 if문을 만듬
				if ((i + 1) % 5 == 0) {
					printer.println();
				}
			}

			// 파일의 내용을 기록한 후
			// 객체들을 close 하여
			// 운영체제가 임시 보관하고 있던 데이터를
			// 데이터 파일에 기록한다.
			printer.close();
			fileWriter.close();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	// 성적결과를 확인(출력)하는 method
	@Override
	public void loadScoreFrom() {

		// ScoreVO 리스트를 생성
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// 한줄씩 값을 읽기 위해 만든 List
		List<String> strLines = new ArrayList<String>();

		// 파일을 읽을때 사용하는 클래스
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			
			//								↓ 점수를 저장한 file
			fileReader = new FileReader(scoreFile);
			
			// 임시저장
			buffer = new BufferedReader(fileReader);
			while (true) {
				
				// enter 전 한줄씩 읽어준다
				String str = buffer.readLine();
				
				// 계속 읽으려는 작업을 하지 않도록
				// str값을 읽는게 끝나면 null => break 하기
				if (str == null) {
					break;
				}
				
				// 한줄식 읽어서 strLines List에 저장
				strLines.add(str);
			}
			
			// buffer, fileReader 클래스 close 하기
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// : 뒤는 배열이나 리스트만 올 수 있다.
		// strLines 리스트의 개수만큼 반복문을 수행
		for (String str : strLines) {
			
			// "문자열을 분해"
			// :을 기준으로 나누어서 저장해라
			String[] scores = str.split(":");
			
			// scoreVO값을 선언 및 초기화
			ScoreVO scoreVO = new ScoreVO();
			
			// scoreVO의 setter 값을 담고
			//              => 이때 문자열로 받았기 때문에
			//					Integer형으로 형변환해서 값을 저장
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setHistory(Integer.valueOf(scores[3]));
			scoreVO.setMusic(Integer.valueOf(scores[4]));
			
			// 담은 scoreVO의 값을 scoreList에 저장
			scoreList.add(scoreVO);
		}

		// 점수의 합 계산
		//	scoreList 리스트의 개수만큼 반복문을 수행
		//	ScoreVO 값을 vo로 선언
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			// ↑ 각 과목의 값을 불러 합하기

			// 다 합한값을 5로 나누어 평균 계산 (float형)
			float avg = (float) sum / 5;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		
		// 성적 리스트를 출력하는 출력문
		System.out.println(Values.dLine);
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			
			// vo변수로 선언한 ScroeVO의 socreList값
			ScoreVO vo = scoreList.get(i);
			
			// 학생 순번
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

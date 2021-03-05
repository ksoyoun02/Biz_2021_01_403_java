package com.callor.score.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;
import com.callor.score.values.Values;

public class FileReader_01 {

	public static void main(String[] args) {

		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();
		String scoreFile = "src/com/callor/score/files/nums_rnd.txt";

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
		
		for(String str : strLines) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setHistory(Integer.valueOf(scores[3]));
			scoreVO.setMusic(Integer.valueOf(scores[4]));
			scoreList.add(scoreVO);
		}
		
		for(ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float)sum / 5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		System.out.println(Values.dLine);
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize; i++) {
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

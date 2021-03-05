package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.values.Values;

public class FileReader_01 {

	public static void main(String[] args) {

		List<String> strLines = new ArrayList<String>();

		String fileName = "src/com/callor/shop/files/nums_rnd.txt";

		/*
		 * 파일을 읽을때 사용하는 클래스
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			/*
			 * 
			 * fileReader를 사용한 저수준 코드
			 * 
			 * while (true) { int ascii = fileReader.read();
			 * 
			 * if(ascii == -1) { break; }
			 * 
			 * System.out.printf("%c\n", ascii);
			 * 
			 * }
			 */
			// BufferedReader -> 임시저장장소
			buffer = new BufferedReader(fileReader);
			while (true) {
				// enter전 한줄씩 읽어준다
				String str = buffer.readLine(); // nextLing()
				// str값은 읽는게 끝나면 null로 표시됨
				if (str == null) {
					break;
				}
				// System.out.println(str);
				// 한줄씩 읽어서 리스트에 담아놓기
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
		// 파일 읽기 끝
		
		for(String str : strLines) {
			
			String[] nums = str.split(":");
			System.out.printf("첫번째 숫자 : %s\n" , nums[0]);
			System.out.printf("두번째 숫자 : %s\n" , nums[1]);
			System.out.printf("세번째 숫자 : %s\n" , nums[2]);
			System.out.printf("네번째 숫자 : %s\n" , nums[3]);
			System.out.printf("다섯번째 숫자 : %s\n" , nums[4]);
			System.out.println(Values.sLine);
			
			int sum = Integer.valueOf(nums[0]);
			sum = Integer.valueOf(nums[1]);
			sum = Integer.valueOf(nums[2]);
			sum = Integer.valueOf(nums[3]);
			sum = Integer.valueOf(nums[4]);
			
			System.out.println("합계 : " + sum);
			System.out.println(Values.dLine);
			
			
		}

	}
}

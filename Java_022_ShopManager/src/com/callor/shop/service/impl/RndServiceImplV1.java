package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Q:
 * 		1. RndServiceImplV1
 * 		2. ../shop/files/nums/txt 파일을 생성하고
 * 		3. 1 ~ 1000까지의 임의의 Random 수를 100개 생성
 * 		4. 숫자들을 한 줄에 5씩, 콜론(:)으로 구분
 */
public class RndServiceImplV1 {

	private List<Integer> intList;
	private Random rnd;
	private String numsFile;

	// 생성자 method
	public RndServiceImplV1() {

		intList = new ArrayList<Integer>();
		numsFile = "src/com/callor/shop/files/nums.txt";
		rnd = new Random();

	}

	public void makeRnd() {

		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(1000) + 1);
		}
	}

	public void saveFileRnd() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFile);
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

			System.out.println("Misson Complete!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
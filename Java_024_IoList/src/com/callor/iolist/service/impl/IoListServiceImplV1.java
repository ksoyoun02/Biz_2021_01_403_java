package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IoListVO;
import com.callor.iolist.service.IoListService;

public class IoListServiceImplV1 implements IoListService {

	private String fileName;
	private List<IoListVO> ioList;

	public IoListServiceImplV1() {
		ioList = new ArrayList<IoListVO>();
		fileName = "src/com/callor/iolist/매입매출데이터.txt";
	}

	@Override
	public void saveList() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for (IoListVO vo : ioList) {

				printer.print(vo.getDate() + ",");
				printer.print(",");
				printer.print(",");
				printer.print(",");
				printer.print(vo.getpName() + ",");
				printer.print(vo.getClient() + ",");
				printer.print(vo.getbName() + ",");
				printer.print(vo.getAccountnum() + ",");
				printer.print(vo.getInMoney() + ",");
				printer.print(vo.getOutMoney() + ",");
				printer.print(vo.getQty() + "\n");

			}
			printer.close();
			fileWriter.close();

			System.out.println("파일 저장 성공!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 생성중 문제 발생!!");
		}

	}

	// 파일에 저장된 매입매출정보를 읽는 method
	@Override
	public void loadList() {

		// 파일을 읽을때 사용하는 클래스
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				// 한줄씩 읽어서 문자형변수 reader에 저장
				String reader = buffer.readLine();
				
				// 값을 다 읽었을 경우 break
				if (reader == null) {
					break;
				}

				// ","를 기준으로 나누어서 cartList 배열에 저장
				String cartList[] = reader.split(",");

				// 배열중 필요한 값을 vo로 선언한 IoListVO 값에 저장
				IoListVO vo = new IoListVO(cartList[0], cartList[4], cartList[5], cartList[6],
						Integer.valueOf(cartList[7]), Integer.valueOf(cartList[8]), Integer.valueOf(cartList[9]),
						Integer.valueOf(cartList[10]));

				// 담은 vo값을 ioList에 저장
				ioList.add(vo);

			}
			// 클래스 close
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) { // 파일을 찾을 수 없을때 오류
			// TODO Auto-generated catch block
			// .printStackTrace();

			System.out.println("파일이 없습니다");
		} catch (IOException e) { // 데이터를 읽을때 오류
			// TODO Auto-generated catch block
			// e.printStackTrace();

			System.out.println("파일을 읽는 동안 문제 발생");
		}

	}

	// 매출리스트를 출력하는 method
	@Override
	public void printList() {
		// TODO Auto-generated method stub

		System.out.println("===========================================================================================");
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		System.out.println("-------------------------------------------------------------------------------------------");

		for (IoListVO vo : ioList) {
			System.out.print(vo.getDate() + "\t");
			System.out.print(vo.getClient() + "\t");
			System.out.print(vo.getpName() + "\t");

			if (vo.getAccountnum() == 1) {
				System.out.print(vo.getInMoney() * vo.getQty() + "\t");
				System.out.print("0\n");
				
			} else {
				System.out.print("0\t");
				System.out.print(vo.getOutMoney() * vo.getQty() + "\n");

			}
		}
		System.out.println("============================================================================================");

	}

}

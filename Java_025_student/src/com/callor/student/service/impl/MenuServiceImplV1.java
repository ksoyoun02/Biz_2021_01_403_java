package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.MenuService;
import com.callor.student.values.Values;

public class MenuServiceImplV1 implements MenuService {

	@Override
	public String scanName() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println(Values.dLine(50));
		System.out.println("찾는 학생의 이름을 입력하세요(종료하시려면 QUIT를 입력");
		System.out.println(Values.sLine(50));

		System.out.print("이름 >> ");
		String sName = scan.nextLine();

		if (sName.equals("QUIT")) {
			System.out.println("종료");
			return null;

		}

		return sName;
	}

}

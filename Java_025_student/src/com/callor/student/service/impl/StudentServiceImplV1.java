package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService {

	private List<StudentVO> sList;

	public StudentServiceImplV1() {

		sList = new ArrayList<StudentVO>();

	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub

		String fileName = "src/com/callor/student/학생정보리스트.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				String sData[] = reader.split(":");

				StudentVO studentVO = new StudentVO(Integer.valueOf(sData[0]), sData[1], sData[2],
						Integer.valueOf(sData[3]), Integer.valueOf(sData[4]), sData[5], sData[6]);

				sList.add(studentVO);
			}

			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(fileName + "파일을 찾을 수 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 문제 발생");
		}

	}

	@Override
	public void printStudentList(String stdName) {
		// TODO Auto-generated method stub

		int nSize = sList.size();
		for (int i = 0; i < nSize; i++) {

			if (sList.get(i).getsName().equals(stdName)) {

				System.out.println("이름 : " + sList.get(i).getsName());
				System.out.println("학과 : " + sList.get(i).getsMajor());
				System.out.println("학년 : " + sList.get(i).getsGrade());
				System.out.println("반 : " + sList.get(i).getsClass());
				System.out.println("주소 : " + sList.get(i).getsAddress());
				System.out.println("전화번호 : " + sList.get(i).getsPhoneNum());
				System.out.println(Values.dLine(50));
				return;
			}
		}
		System.out.println("* 데이터가 없습니다");
		System.out.println(Values.dLine(50));
		System.out.println(stdName + "자료는 없습니다");
		System.out.println(Values.dLine(50));

	}
}

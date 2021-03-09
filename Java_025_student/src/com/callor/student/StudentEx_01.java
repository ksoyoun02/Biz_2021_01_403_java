package com.callor.student;


import com.callor.student.service.MenuService;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.MenuServiceImplV1;
import com.callor.student.service.impl.StudentServiceImplV1;

public class StudentEx_01 {

	public static void main(String[] args) {

		
		StudentService ssV1 = new StudentServiceImplV1();
		MenuService msV1 = new MenuServiceImplV1();

		String sName = msV1.scanName();

		ssV1.loadData();
		ssV1.printStudentList(sName);

	}

}

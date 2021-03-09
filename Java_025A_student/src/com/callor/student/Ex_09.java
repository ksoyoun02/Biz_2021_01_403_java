package com.callor.student;

import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;

public class Ex_09 {
	
	public static void main(String[] args) {
		
		List<StudentVO> stdList = null;
		for(int i = 0 ; i < 10 ; i++) {
			
			StudentVO stdVO = null;
			
			//↓ 없으면 nullpoint exception이 나옴
			stdVO = new StudentVO();
			stdList = new ArrayList<StudentVO>();
			
			stdVO.setStName("홍길동");
			stdVO.setStNum("0001");
			stdList.add(stdVO);
		}
	}

}

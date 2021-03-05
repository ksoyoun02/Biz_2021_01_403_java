package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1_00;

public class FileWriter_07 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/Score.txt";
		
		RndServiceImplV1_00 rV1 = new RndServiceImplV1_00();
		rV1.makeRnd();
		rV1.saveFileRnd(fileName);
		
	}
}

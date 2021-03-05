package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1_00;

public class FileWriter_05_00 {
	public static void main(String[] args) {

		RndServiceImplV1_00 rsV1 = new RndServiceImplV1_00();

		rsV1.makeRnd();
		rsV1.saveFileRnd();
		rsV1.saveFileRnd("src/com/callor/shop/files/numsRnd.txt");
	}
}
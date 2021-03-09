package com.callor.iolist;

import com.callor.iolist.service.IoListService;
import com.callor.iolist.service.impl.IoListServiceImplV1;

public class IoList_01 {
	
	
	public static void main(String[] args) {
	
		IoListService ioV1 = new IoListServiceImplV1();
		
		ioV1.loadList();
		//ioV1.saveList();
		ioV1.printList();
		
	}

}

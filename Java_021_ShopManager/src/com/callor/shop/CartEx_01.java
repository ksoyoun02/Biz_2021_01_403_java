package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceV1;
import com.callor.shop.service.impl.MenuServiceV1;

public class CartEx_01 {

	public static void main(String[] args) {

		// MenuService interface를 mService로 선언하고 MenuServiceV1을 호출하여 mService에 저장했다. 
		MenuService mService = new MenuServiceV1();
		CartService cService = new CartServiceV1();

		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) { //mService의 selectMenu method에서 "QUIT" 값을 입력할 경우 break 하고 null값을 return 하기로 함
				break;
			} else if (menu == 1) {
				cService.inputCart();
			} else if (menu == 2) {
				cService.printCart();
			} else if (menu == 3) {
				cService.printUserCart();
			}
		}

	}
}

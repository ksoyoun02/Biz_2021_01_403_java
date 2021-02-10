package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {

	public static void main(String[] args) {
		
		MyGuGuDan myGu = new MyGuGuDan();
		/*
		 * MyGuGuDan 클래스에 정의된 print() method 호출
		 * MyGuGuDan 클래스의 print() method 호출
		 * 
		 * print(int) .... arguments ()
		 *  => 정수형 값을 괄호안에 넣어라
		 */
		myGu.print(8);
		         //↑ arguments : 매개변수
		
		Random rnd = new Random();
		// Random 클래스의 nextInt()를 호출하라
		rnd.nextInt(10); // 호출 하면서 정수 10을 주입하라
		rnd.nextInt(); // 그냥 호출만 하라

		Scanner scan = new Scanner(System.in);
		// Scanner 클래스의 nextInt() method를 호출하라
		scan.nextInt();

		Random rd = new Random();
		rd.nextInt(100);
		
	}
}

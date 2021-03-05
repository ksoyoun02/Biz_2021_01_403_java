package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// < method를 분리하는 방법 >
public class FileWriter_04 {

	// 클래스영역에 선언된 변수 -> "인스턴스 변수" => 필요할때 만들어 쓰고 버림
	// static으로 선언된 변수 -> "클래스 변수"
	
	/*
	 * 클래스 영역에 변수를 선언하는 것은 
	 * 현재 클래스가 포함하고 있는 모든 method들이 
	 * 변수를 공유하여 코드를 수행하게 하려는 의도 이다
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에
	 * 선언된 클래스 영역 변수를 "인스턴스 변수"라고 한다.
	 * 인스턴스 변수는 GC에 의해 메모리 관리가 자동으로 이루어진다.
	 * 
	 * static method에서 필요한 변수들은 변수를 선언할때
	 * static 키워드를 추가하여 static 변수로 만든다
	 * 
	 * static 변수는 GC이 접근하지 못한다.
	 * 프로젝트가 시작될때 만들어지고, 계속 존재하는 상태다
	 * 
	 * 프로젝트가 시작될때 클래스가 자동으로 만들어지고
	 * 이때 static 변수들도 자동으로 생성된다.
	 * 
	 * 클래스가 생성될 때 같이 만들어진다는 의미로
	 * static 키워드가 부착된 변수를 "클래스변수"라고 한다
	 * 
	 * static 변수는 생성과 선언을 동시에 하도록 코드를 작성한다.
	 * 
	 * 다만, static 생성자를 만들어 별도로 생성을 하는 경우도 있다.
	 * 			=> static {
	 * 					}
	 */
	
	/*
	 * 멤버변수에는 2가지가 있다! 
	 *  ( 1 )			(2)
	 * static 변수와 인스턴스 변수의 차이점
	 * 1. static이 붙어있은지 여부
	 * 2. static 변수는 프로젝트가 시작될때 클래스가 자동으로 만들어지고
	 * 		이때 static 변수들도 자동으로 생성된다. 무조건 만들어짐
	 *		인스턴스변수 클래스를 객체로 선언하고 객체가 생성될때 만들어진다, 필요할때만 만들어짐
	 * 		GC에 따라서 메모리가 관리된다
	 */
	
	private static String numsFile ;
	private static List<Integer> intList;
	static {
		numsFile = "src/com/callor/shop/files/nums_00.txt";
		intList = new ArrayList<Integer>();
	}

	
	/*
	 * main() method와 같은 class 내에 있는 다른 method를 호출하여 코드를 수행할 경우
	 * main() method의 호출을 받는 method들은 모두
	 * static 으로 선언 되어야 한다.
	 * 
	 * main() method와 static으로 선언된 method들이 클래스 영역에 선언된 변수를
	 * 공유하려면 class 영역에 선언된 변수들도 모두
	 * static으로 선언 되어야 한다.
	 */
	public static void main(String[] args) {
		/*
		 * 1. static으로 선언된 method 내에서는 같은 클래스의 다른 method를 
		 * 		this.method() 형식으로 호출하지 못한다.
		 *       ex) this.makeNums();  <- 오류
		 * 2. 
		 */
		makeNums();
		saveFileNums();
		
	} // end main()

	private static void makeNums() {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {

			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);

			intList.add(rnd.nextInt(1000) + 1);
		}

	}

	private static void saveFileNums() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);

			// intList에 담긴 전체리스트를
			// 향상된 for로 반복하면서 파일에 출력
			for (Integer n : intList) {
				printer.println(n);
			}

			// 표준형 for로 반복하면서 파일에 출력
			int nSize = intList.size();
			for (int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}

			printer.close();
			fileWriter.close();

			System.out.println("Misson Complete!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

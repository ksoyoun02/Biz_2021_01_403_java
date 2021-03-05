package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		String cartFileName = "src/com/callor/shop/nums.txt";
		int[] nums = new int[100];
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(cartFileName);
			printer = new PrintWriter(fileWriter);


			printer.println("1 ~ 1000까지의 임의의 난수 100개");

			for (int i = 0; i < nums.length; i++) {
				nums[i] = rnd.nextInt(1000) + 1;
				
				printer.println(nums[i]);
			
			}
			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
package com.callor.student.values;

public class Values {

	public static String dLine(int count) {

		String dLineFormat = "%0" + count + "d";
		String dLine = String.format(dLineFormat, 0).replace("0", "=");

		return dLine;
	}

	public static String sLine(int count) {

		// count가 50이라면 %050d의 문자열이 만들어진다
		String sLineFormat = "%0" + count + "d";
		String sLine = String.format(sLineFormat, 0).replace("0", "-");

		return sLine;
	}

}

package com.callor.score.values;

public class Values {
	
	// static 블럭에서 선언해야함
	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	static {
		
		// ================================의 코드화
		dLine = String.format("%050d", 0).replace("0","=");
		sLine = String.format("%050d", 0).replace("0","-");
		
	}

}

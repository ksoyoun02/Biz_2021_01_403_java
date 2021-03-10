package com.callor.score.model;

public class ScoreVO {

	private int stNum;
	private int stKor;
	private int stEng;
	private int stMath;
	private int stMusic;
	private int stSum;
	private float stAvg;

	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(int stNum, int stKor, int stEng, int stMath, int stMusic, int stSum, float stAvg) {
		super();
		this.stNum = stNum;
		this.stKor = stKor;
		this.stEng = stEng;
		this.stMath = stMath;
		this.stMusic = stMusic;
		this.stSum = stSum;
		this.stAvg = stAvg;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public int getStKor() {
		return stKor;
	}

	public void setStKor(int stKor) {
		this.stKor = stKor;
	}

	public int getStEng() {
		return stEng;
	}

	public void setStEng(int stEng) {
		this.stEng = stEng;
	}

	public int getStMath() {
		return stMath;
	}

	public void setStMath(int stMath) {
		this.stMath = stMath;
	}

	public int getStMusic() {
		return stMusic;
	}

	public void setStMusic(int stMusic) {
		this.stMusic = stMusic;
	}

	public int getStSum() {
		return stSum;
	}

	public void setStSum(int stSum) {
		this.stSum = stSum;
	}

	public float getStAvg() {
		return stAvg;
	}

	public void setStAvg(float stAvg) {
		this.stAvg = stAvg;
	}

	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", stKor=" + stKor + ", stEng=" + stEng + ", stMath=" + stMath + ", stMusic="
				+ stMusic + ", stSum=" + stSum + ", stAvg=" + stAvg + "]";
	}

}

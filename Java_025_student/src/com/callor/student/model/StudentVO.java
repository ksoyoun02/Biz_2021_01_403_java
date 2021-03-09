package com.callor.student.model;

public class StudentVO {
	
	private int sNum;
	private String sName;
	private String sMajor;
	private int sGrade;
	private int sClass;
	private String sAddress;
	private String sPhoneNum;
	
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public StudentVO(int sNum, String sName, String sMajor, int sGrade, int sClass, String sAddress, String sPhoneNum) {
		super();
		this.sNum = sNum;
		this.sName = sName;
		this.sMajor = sMajor;
		this.sGrade = sGrade;
		this.sClass = sClass;
		this.sAddress = sAddress;
		this.sPhoneNum = sPhoneNum;
	}



	public int getsNum() {
		return sNum;
	}



	public void setsNum(int sNum) {
		this.sNum = sNum;
	}



	public String getsName() {
		return sName;
	}



	public void setsName(String sName) {
		this.sName = sName;
	}



	public String getsMajor() {
		return sMajor;
	}



	public void setsMajor(String sMajor) {
		this.sMajor = sMajor;
	}



	public int getsGrade() {
		return sGrade;
	}



	public void setsGrade(int sGrade) {
		this.sGrade = sGrade;
	}



	public int getsClass() {
		return sClass;
	}



	public void setsClass(int sClass) {
		this.sClass = sClass;
	}



	public String getsAddress() {
		return sAddress;
	}



	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}



	public String getsPhoneNum() {
		return sPhoneNum;
	}



	public void setsPhoneNum(String sPhoneNum) {
		this.sPhoneNum = sPhoneNum;
	}



	@Override
	public String toString() {
		return "StudentVO [sNum=" + sNum + ", sName=" + sName + ", sMajor=" + sMajor + ", sGrade=" + sGrade
				+ ", sClass=" + sClass + ", sAddress=" + sAddress + ", sPhoneNum=" + sPhoneNum + "]";
	}
	



	
	

}

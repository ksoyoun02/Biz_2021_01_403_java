package com.callor.iolist.model;

public class IoListVO {
	
	private String date;
	private String pName;
	private String client;
	private String bName;
	private int accountnum;
	private int inMoney;
	private int outMoney;
	private int qty;
	
	
	public IoListVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IoListVO(String date, String pName, String client, String bName, int accountnum, int inMoney, int outMoney,
			int qty) {
		super();
		this.date = date;
		this.pName = pName;
		this.client = client;
		this.bName = bName;
		this.accountnum = accountnum;
		this.inMoney = inMoney;
		this.outMoney = outMoney;
		this.qty = qty;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public int getInMoney() {
		return inMoney;
	}
	public void setInMoney(int inMoney) {
		this.inMoney = inMoney;
	}
	public int getOutMoney() {
		return outMoney;
	}
	public void setOutMoney(int outMoney) {
		this.outMoney = outMoney;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "IoListVO [date=" + date + ", pName=" + pName + ", client=" + client + ", bName=" + bName
				+ ", accountnum=" + accountnum + ", inMoney=" + inMoney + ", outMoney=" + outMoney + ", qty=" + qty
				+ "]";
	}
	
	
}

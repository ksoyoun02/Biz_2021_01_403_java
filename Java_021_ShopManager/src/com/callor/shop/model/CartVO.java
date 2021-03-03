package com.callor.shop.model;

// 필요한 데이터 항목
// Value Ogject 클래스
public class CartVO {

	// 인스턴스 변수의 은닉
	private String userName;
	private String ProductName;
	private String date;
	private String time;
	private int qty;
	private int price;
	private int total;
	
	// private으로 은닉된 인스턴스 변수에
	// 값을 저장, 읽기 하기 위한 용도의
	// getter(), setter() method 선언
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", ProductName=" + ProductName + ", date=" + date + ", time=" + time
				+ ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
}

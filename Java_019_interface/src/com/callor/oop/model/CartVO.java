package com.callor.oop.model;

/*
 * 카트정보를 담아 app에서 사용할
 * Value Ogject 클래스
 * 구매자, 상품명, 규격, 날짜 시각, 수량, 구매단가, 구매금개
 */
public class CartVO {

	private String UserName;
	private String productName;
	private String sgandard;
	private String date;
	private String time;

	private int qty;
	private int price;
	private int total;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSgandard() {
		return sgandard;
	}

	public void setSgandard(String sgandard) {
		this.sgandard = sgandard;
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
		return "CartVO [UserName=" + UserName + ", productName=" + productName + ", sgandard=" + sgandard + ", date="
				+ date + ", time=" + time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}

}

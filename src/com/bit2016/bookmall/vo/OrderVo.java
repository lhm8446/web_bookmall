package com.bit2016.bookmall.vo;

public class OrderVo {
	private Long no;
	private Long no2;
	private Long price;
	private String address;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getNo2() {
		return no2;
	}
	public void setNo2(Long no2) {
		this.no2 = no2;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", no2=" + no2 + ", price=" + price + ", address=" + address + "]";
	}

}

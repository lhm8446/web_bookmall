package com.bit2016.bookmall.vo;

public class CartVo {
	private Long no;
	private Long no2;
	private Long amount;
	
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
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", no2=" + no2 + ", amount=" + amount + "]";
	}

}

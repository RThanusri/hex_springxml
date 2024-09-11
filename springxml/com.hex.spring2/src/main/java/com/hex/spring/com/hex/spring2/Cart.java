package com.hex.spring.com.hex.spring2;

public class Cart {
	int qty;
	double totalBill;
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	Cart()
	
	{
		
	}
	public Cart(int qty, double totalBill) {
		super();
		this.qty = qty;
		this.totalBill = totalBill;
	}
	@Override
	public String toString() {
		return "Cart [qty=" + qty + ", totalBill=" + totalBill + "]";
	}
	

}

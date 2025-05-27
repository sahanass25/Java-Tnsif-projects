package com.Commission;

import java.util.Objects;

public class Commission {
// Name,Address,Phone,Sales-amount
	private String name;
	private String address;
	private long phoneNum;
	private double salesAmount;
	public Commission(String name , String address, long phoneNum, double salesamount) {
		super();
		this.name= name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.salesAmount= salesamount;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}
	@Override
	public String toString() {
		return "Commission [name=" + name + ", address=" + address + ", phoneNum=" + phoneNum + ", salesAmount="
				+ salesAmount + "]";
	}
	public void totalCommission() {
		double salesAmount= getSalesAmount();
		System.out.print("Total Commission:");
		if(salesAmount>= 100000) {
			System.out.println(salesAmount*0.1);
		}
		else if(50000 <= salesAmount && salesAmount < 100000) {
			System.out.println(salesAmount*0.05);
		}
		else if(30000 <= salesAmount && salesAmount < 50000) {
			System.out.println(salesAmount*0.03);
		}
		else if(salesAmount < 30000) {
			System.out.println("No Commission");
		}
		
	}
}
	
	
	


package com.Bankaccount;

public class UPI implements Payment {
	String UPIid;
	

	public UPI(String UPIid) {
		super();
		this.UPIid = UPIid;
	}
	

	@Override
	public void process(double amount) {
		System.out.println("the payment proccessed through UPIid is INR : "+amount+" with the UPIid:" +UPIid);
		
	}
	 
}	


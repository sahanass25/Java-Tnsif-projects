package com.Bankaccount;

public class Debitcard implements Payment {
	String CardNumber;
	

	public Debitcard(String CardNumber) {
		super();
		this.CardNumber = CardNumber;
	}
	

	@Override
	public void process(double amount) {
		System.out.println("the payment proccessed through Debit card is INR: "+amount+" with the Debit CardNumber: "+CardNumber);
		

		
	}

}

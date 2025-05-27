package com.Bankaccount;

public class Creditcard implements Payment {
	String CardNumber;
	 

	public Creditcard(String CardNumber) {
		super();
		this.CardNumber = CardNumber;
	}
	


	@Override
	public void process(double amount) {
		System.out.println("the payment proccessed through Creditcard is INR : "+amount+" with the Credit cardNumber:" +CardNumber);
		
		
	}

}

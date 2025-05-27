package com.Bankaccount;

public class Main {
	public static void main(String args[]) {
		Payment Creditcard= new Creditcard("9798 7999 8976 6756");
		Creditcard.process(93000);
		
		
		Payment UPI= new UPI("938657");
		UPI.process(456454);
		
		Payment Debitcard = new Debitcard("7470 8556 8757 4847");
		Debitcard.process(97000);
		

}
}
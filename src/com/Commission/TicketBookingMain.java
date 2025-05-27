package com.Commission;

public class TicketBookingMain {

	public static void main(String[] args) {
		TicketBooking obj=new TicketBooking();
		for(int i=0;i<3;i++) {
			System.out.println("Person:"+(i+1));
			obj. bookTicket();
		}
		
	}


	}



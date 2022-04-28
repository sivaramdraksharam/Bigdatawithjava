package com.satyam.day29.inheritance;

public abstract class Ticket {
	
	private int ticketNumber;
	
	public abstract void bookTicket() ;

	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	
	public void printTicket()
	{
		System.out.println("Printing ticket");
	}

}

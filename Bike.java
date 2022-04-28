package com.satyam.day29.inheritance;
//multiple inheritance 
public class Bike extends Honda implements Twowheeler,Automobile{

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void balance() {
		System.out.println("Just tilt handle for balancing");
		
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Number of wheels:"+WHEELS);
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike has auto start button");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Bike show");
	}

}

package com.satyam.day29.inheritance;

public class Bicycle extends Honda implements Twowheeler{

	public Bicycle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void balance() {
		System.out.println("Balancing bycicle");
		
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("Bicycle show");
		
	}

}

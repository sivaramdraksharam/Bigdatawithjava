package com.satyam.day29.inheritance;

public class Birddemo {

	public Birddemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b=new Bird();
		b.fly();
		
		Bird p=new Bird("Parrot","Green",false);
		
		p.fly();
		
		Flight f=new Flight();
		f.setFilghtNumber("3304");
		f.setAirWays("Jet Airways");
		f.fly();
		
	}

}

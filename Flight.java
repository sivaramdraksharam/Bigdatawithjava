package com.satyam.day29.inheritance;

public class Flight extends Bird {
	private String filghtNumber;
	private String airWays;

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public String getFilghtNumber() {
		return filghtNumber;
	}

	public void setFilghtNumber(String filghtNumber) {
		this.filghtNumber = filghtNumber;
	}

	public String getAirWays() {
		return airWays;
	}

	public void setAirWays(String airWays) {
		this.airWays = airWays;
	}

	
	  @Override 
	  public void fly() {
	  System.out.println(this.airWays+" "+this.filghtNumber+" "+" is flying "); }
	  
	 
}

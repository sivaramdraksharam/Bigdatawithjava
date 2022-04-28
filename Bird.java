package com.satyam.day31.beans;

public class Bird {

	private String birdName;
	private String birdColor;
	private  int legs;
	private  int wings;
	
	public Bird() {
	
		legs=2;
		wings=2;
	} 

	public String getBirdName() {
		return birdName;
	}

	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}

	public String getBirdColor() {
		return birdColor;
	}

	public void setBirdColor(String birdColor) {
		this.birdColor = birdColor;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

		
	

}

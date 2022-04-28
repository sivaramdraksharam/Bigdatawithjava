package com.satyam.day31.beans;

import java.io.Serializable;

public class Product implements Serializable{
	//private properties
	private int id;
	private String name;
	private float qty;
	private String type;
	//no-arg constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}

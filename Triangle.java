package com.satyam.day29.inheritance;

public class Triangle extends Shape{
	private float base;
	private float height;

	public Triangle() {
		// TODO Auto-generated constructor stub
		vertex=3;
	}
	
	
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}


	public void calcArea()
	{
		float area=0.5f*base*height;
		System.out.println("Area of traingle is "+area);
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

}

package com.satyam.day29.inheritance;

public class Circle extends Shape{
	float radius;
	public Circle() {
		// TODO Auto-generated constructor stub
		vertex = 0;
	}
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public void calcArea()
	{
		float area=3.141f*radius*radius;
		System.out.println("Area of circle is "+area);
	}

}

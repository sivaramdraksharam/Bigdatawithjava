package com.satyam.day29.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shapedemo {

	public Shapedemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		Triangle t=new Triangle();
		t.setBase(50);
		t.setHeight(20);
		t.calcArea();
		Circle c=new Circle();
		c.radius=5.2f;
		c.calcArea();
		
		//A super class reference is assigned with subclass instance
		Shape ts=null;
		System.out.println("Menu");
		System.out.println("1.Traingle");
		System.out.println("2.Circle");
		System.out.println("3.Exit");
		System.out.println("Enter your choice(1-3):");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cho=Integer.parseInt(br.readLine());
		switch(cho)
		{
		case 1 : ts=getShape(1);
				 ts.calcArea();
					break;
		case 2 : ts=getShape(2);
					ts.calcArea();
					break;
		case 3 : break;
		default: System.out.println("Invalid choice!!!");
		}
	}
	
	public static Shape getShape(int cho) throws IOException
	{
		if(cho==1)
			return new Triangle(50,20);
		else if(cho==2)
			return new Circle(5.2f);
		else 
			return null;
			
	}

}

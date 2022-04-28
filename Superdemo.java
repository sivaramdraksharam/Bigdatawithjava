package com.satyam.day31.poly;

class Construction
{
	public Construction()
	{
		System.out.println("Construction");
	}
}

class Building extends Construction
{
	protected int walls;
	protected String color;
	//no-arg constructor
	public Building()
	{
			walls=2;
			System.out.println("Building constructor");
			
	}
	public Building(int walls, String color) {
		super();
		this.walls = walls;
		this.color = color;
	}
	
	
		
}
class House extends Building
{
	private int rooms;
	
	public House()
	{
		//super must be the first statement in subclass constructor
		super(4,"Cyan");
		System.out.println("House constructor");
		System.out.println("Minimum walls"+walls);
		rooms=1;
		
		
	}
	
	
}


public class Superdemo {

	
	public static void main(String[] args) {
		
		House h=new House();
		System.out.println("House color:"+h.color);
		

	}

}

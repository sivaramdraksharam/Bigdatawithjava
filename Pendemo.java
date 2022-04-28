package com.satyam.day31.poly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//runtime polymorphism - demo for instanceof keyword
public class Pendemo {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//create object of pen by calling getPen() method 
		Pen p=getPen();
		//checking the instance created
		if(p instanceof Ballpen)
		{
			System.out.println("Start writing with Ball pen");
			p.write();
		}else
			if(p instanceof Inkpen)
			{
				System.out.println("Start writing with Inkpen");
				p.write();
			}
		}
	
	//static method returns an object
	public static Pen getPen() throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your chioce:(1.Ball pen 2.Ink pen)");
		int choice=Integer.parseInt(br.readLine());
		if(choice==1)
		{
			//returning an object
					return new Ballpen();
		}
		else if(choice==2)
		{
			//returning an object
				return new Inkpen();
		}
		else 
			return null;
				
	}
}

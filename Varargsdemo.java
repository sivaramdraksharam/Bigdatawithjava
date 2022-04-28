package com.satyam.day29;

public class Varargsdemo {

	public Varargsdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(2,5,8,10);	

	}
	public static void add(Integer... numbers )
	{
		//variable definition
		int sum=0;
		//loop through array numbers to get each element value 
		for(int n : numbers)
		{
			//add each element to sum variable
			sum+=n;
		}
		System.out.println(sum);
	}
	
}

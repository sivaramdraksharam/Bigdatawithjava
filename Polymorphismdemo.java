package com.satyam.day29;
//method overloading
public class Polymorphismdemo {

	public Polymorphismdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(float a, float b)
	{
		System.out.println(a+b);
		
	}
	
	public static void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void add(int a, int b,int c, int d)
	{
		System.out.println(a+b+c+d);
	}



}

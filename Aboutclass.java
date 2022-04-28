package com.satyam.day29;

public class Aboutclass {

		static int lucky=786;
		
	public Aboutclass() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("main method");
			System.out.println("Lucky number is"+lucky);
			Aboutclass ac=new Aboutclass();
	}
	
	static {
		lucky=1;
		System.out.println("first static block lucky:"+lucky);
	}
	static {
		lucky=2;
		System.out.println("second static block lucky:"+lucky);
	}

}

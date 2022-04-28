package com.satyam.day31.poly;

public class Staticpolydemo {

	public Staticpolydemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
						
			float result=add(5.5f,2.3f);
			System.out.println("Result:"+result);
		
	}
	public static int add(int x, int y)
	{
		System.out.println("integer sum");
		return x+y;
	}
	public static float add(float x, float y)
	{
		System.out.println("real sum");
		return x+y;
	}

}

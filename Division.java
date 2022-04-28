package com.satyam.day30;

import java.io.IOException;
import java.util.Scanner;

public class Division {

	public Division() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException  {
		Scanner sc=new Scanner(System.in);
		if(args.length==2)
		{
			//suspected code - keep it in try block
		try{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int result=a/b;
		System.out.println("Division result:"+result);
		}catch(ArithmeticException ae)//exception handler 1
		{
			//ae.printStackTrace();
			System.out.println("Denominator should not be ZERO");
		}catch(NumberFormatException ne)//exception handler 2
		{
			System.out.println("Only numbers allowed");
		}catch(Exception e)//Exception is the super class for all exceptions, hence keep it in the last
		{
			e.printStackTrace();
		}finally
		{
			sc.close();
			
			System.out.println("Operation successful");
		}
		}else
		{
			System.out.println("Please pass two numbers as command line arguments!");
		}
	}

}

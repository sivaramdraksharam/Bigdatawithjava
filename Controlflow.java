package com.satyam.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Controlflow {

	public Controlflow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
	
		char ch;
		//program to print input is positive or negative or ZERO
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive");
			
		}else if(n<0)
		{
			System.out.println("Negative");
		}else
		{
			System.out.println("ZERO");
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an english alphabet");
		ch=br.readLine().charAt(0);
		
		switch(ch)
		{
		case 'a':System.out.println("It is a Vowel");break;
		case 'e':System.out.println("It is a Vowel");break;
		case 'i':System.out.println("It is a Vowel");break;
		case 'o':System.out.println("It is a Vowel");break;
		case 'u':System.out.println("It is a Vowel");break;
		default : System.out.println("It's a consonant");
		}
		
		int tableNumber;
		System.out.println("Enter a number to print its table:");
		tableNumber=sc.nextInt();
		
		for(int i=1;i<11;i++)
		{
			System.out.println(tableNumber+" x "+i+" = "+tableNumber*i);
		}
		
		
		
		
	}

}

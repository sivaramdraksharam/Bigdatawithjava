package com.satyam.day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Arraydemo {

	//constructor
	public Arraydemo() {
		// TODO Auto-generated constructor stub
	}

	//satic method -1
	public static void main(String[] args) throws IOException{
	//declaring an array of 20 units of char length
		char fullName[]=new char[20];
		//defining an array
		char name[]= {'S','I','V','A'};
		
		//declare 2-d array to store 3 friend names whose maximum length can be 20 characters
		String friendNames[]=new String[3];
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		//input friend names into 1-d array
		for(int i=0;i<3;i++)
		{
							System.out.println("Enter friend name:");
							friendNames[i]=br.readLine();
			
		}
		//declare 2-d array
		char friends[][]=new char[3][20];

		//declare 3-d array
		float marks[][][]=new float[2][4][3];
		
		friends[0]=friendNames[0].toCharArray();
		friends[1]=friendNames[1].toCharArray();
		friends[2]=friendNames[2].toCharArray();
		
		for(int i=0;i<3; i++)
		System.out.println(friendNames[i]);
			
		Arraydemo ad=new Arraydemo();
		ad.sort(friendNames);
		//showArray(friendNames);

	}
	
	//non-static method
	public void sort(String[] names) {
		
		
		System.out.println("Arraning the things or objects in ascending or descending order");
		System.out.println("Friends in sorted way:");
		//Arrays.parallelSort(names);
		Arrays.sort(names);
		for(String s : names)
		{
			System.out.println(s);
		}
		
		
	}
	//static method-2
	public static void showArray(String[] names)
	{
		System.out.println("Friends are ...");
		for(String name : names)
		{
			System.out.println(name);
		}
		
	}
	

}

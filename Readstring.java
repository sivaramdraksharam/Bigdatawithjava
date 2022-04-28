package com.satyam.day31.myfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
//program to read a string from keyboard and stores it as an object in fruits.txt file
public class Readstring {

	public Readstring() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) throws IOException
	{
	
		String s[]=new String[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//accept 3 strings from keyboard
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Enter a fruit name:");
		s[i] = br.readLine();
		}

		//To store 3 strings array in a file, create file
		File myfile = new File("C:\\Users\\dell\\OneDrive\\Desktop\\fruits.txt");
		FileOutputStream fos = new FileOutputStream(myfile);
		//storing an object in a file is called serialization
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// fos.write(ch);

		oos.writeObject(s);

		System.out.println("File fruits.txt created");
		//close streams
		oos.close();
		fos.close();
	}

}

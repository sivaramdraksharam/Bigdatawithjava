package com.satyam.day31.myfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Readstringfromfile {

	public Readstringfromfile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//create a String variable to get data from a file
		String fruitName[]=new String[3];
		
		//specify the source of information from where we have to read data into memory
		File source=new File("C:\\Users\\dell\\OneDrive\\Desktop\\fruits.txt");
		
		//read from file object using file input stream
		FileInputStream fis=new FileInputStream(source);
		
		//to read an object from a file, create object input stream object
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		fruitName=(String[])ois.readObject();
		
		for(String fruit : fruitName)
		{
		System.out.println("Fruit from fruits.txt file is:"+fruit);
		}
		
		//close streams
		fis.close();
		ois.close();
	}

}

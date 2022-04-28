package com.satyam.day31.myfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

//reading a character from keyboard and writing it into a file called onechar.txt
public class Readachar {

	public Readachar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		char ch;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character:"); ch=br.readLine().charAt(0);
		
		File myfile = new File("C:\\Users\\dell\\OneDrive\\Desktop\\onechar.txt");
		FileOutputStream fos = new FileOutputStream(myfile);
		fos.write(ch);
		System.out.println("File fruits.txt created");
		//close streams
				fos.close();

	}

}

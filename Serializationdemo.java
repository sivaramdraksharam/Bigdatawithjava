package com.satyam.day31.myfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.satyam.day31.beans.Product;

public class Serializationdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//persistent object
		Product p=new Product();
		
		p.setId(1);
		p.setName("Gemini");
		p.setQty(500);
		p.setType("Consumable");
		
		//serialization
		File file=new File("C:\\Users\\dell\\OneDrive\\Desktop\\prod.dat");
		
		
		FileOutputStream fos=new FileOutputStream(file);
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(p);
		
		System.out.println("Wish to read p object from file prod.dat?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char reply=br.readLine().charAt(0);
		
		if(reply=='y' || reply=='Y')
		{
			//de-serialization
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Product prod=(Product)ois.readObject();
			System.out.println("Id:"+prod.getId());
			System.out.println("Name:"+prod.getName());
			System.out.println("Type:"+prod.getType());
			System.out.println("Quantity in nos:"+prod.getQty());
			
			fis.close();
			ois.close();
				
		}
		
		//close streams
		fos.close();
		oos.close();
		
	}

}

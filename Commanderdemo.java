package com.satyam.day37.dp.singletonpattern;

import java.util.Calendar;

public class Commanderdemo {

	public static void main(String[] args) {
		
		President p1=President.getPresident();
		
		President p2=President.getPresident();
		
		Calendar c=Calendar.getInstance();
		
		p1.setName("Sri Ramnadh Kovind");
		p1.setCountry("India");
		
		System.out.println(p1);
		System.out.println(p1.hashCode());
		
		System.out.println(p2);
		System.out.println(p2.hashCode());
		
		
	}

}

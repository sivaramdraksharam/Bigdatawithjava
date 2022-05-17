package com.satyam.day37.dp.singletonpattern;

//singleton demo
public class President {
	private static President president;
	private String name;
	private String country;

	//writing private constructor
	private President() {
		System.out.println("President created");
	}

	public static President getPresident()
	{
		if(president==null)
		{
			president=new President();
		}
		return president;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+name+" is the President for "+country;
	}
	

}

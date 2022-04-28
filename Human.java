package com.satyam.day29.inheritance;

public class Human extends Ape {
	
	public Human() {
		tail=0;
		nickName="Laddu";
		System.out.println("Human constructor");
	}
	public void talk()
	{
		System.out.println("talking");
	}

}

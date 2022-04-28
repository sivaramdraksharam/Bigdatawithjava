package com.satyam.day29.inheritance;

public interface Twowheeler {
	//all the members are public static final by default
	public static final int WHEELS=2;
	
	abstract void balance();
	abstract void showDetails();
	public abstract void show();
	

}


interface Account{
	
	abstract void openAccount();
	abstract void closeAccount();
	/*
	 * public void showStatement() { System.out.println("Statement for 3 months"); }
	 */
	
}
class SavingsAccount implements Account{

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		
	}}
class CurrentAccount implements Account{

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		
	}}
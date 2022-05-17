package com.satyam.day37.dp.singletonpattern;
class Database {
	
	   private static Database dbObject;
	   //private constructor
	   private Database() {      
	   }

	   public static Database getInstance() {

	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new Database();
	      }else {
	    	  System.out.println("Already exists!");
	      }

	       // returns the singleton object
	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}


	class Main {
	   public static void main(String[] args) {
	      Database db1,db2;

	      // refers to the only object of Database
	      db1=Database.getInstance();
	      
	      db1.getConnection();
	      System.out.println(db1.hashCode());
	      
	      db2= Database.getInstance();
		  System.out.println(db2.hashCode());
	     
	   }
	 
	}
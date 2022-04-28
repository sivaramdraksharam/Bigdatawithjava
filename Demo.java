package com.satyam.day29.inheritance;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmployeeId(4109);
		e.setEmployeeName("Sivaram");
		e.setEmpployeeSalary(50000.00F);
		
		Manager m=new Manager();
		m.setEmployeeId(111);
		m.setEmployeeName("George");
		m.setEmpployeeSalary(100000.00F);
		m.setCoveyanceAllowance(20000f);
		
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getEmpployeeSalary());
		
		System.out.println(m.getEmployeeId());
		System.out.println(m.getEmployeeName());
		System.out.println(m.getEmpployeeSalary());
		System.out.println(m.getCoveyanceAllowance());

	}

}

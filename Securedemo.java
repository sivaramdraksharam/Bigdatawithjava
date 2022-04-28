package com.satyam.day30.secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.satyam.day29.inheritance.Employee;



public class Securedemo {

	public Securedemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// create department array
		Department dept[] = new Department[3];
		// adding departments
		dept[0]=new Department();
		dept[0].setDepartmentId(1);
		dept[0].setDepartmentName("Sales");

		dept[1]=new Department();
		dept[1].setDepartmentId(2);
		dept[1].setDepartmentName("Operations");

		dept[2]=new Department();
		dept[2].setDepartmentId(3);
		dept[2].setDepartmentName("Production");
		// display departments
		for (Department d : dept) {
			System.out.println("Department Id:" + d.getDepartmentId());
			System.out.println("Department Name:" + d.getDepartmentName());
		}

		// create employee array
		Employee e[] = new Employee[2];

		// add employees
		e[0]=new Employee();
		e[0].setEmployeeId(123);
		e[0].setEmployeeName("Arun");
		e[0].setEmpployeeSalary(25000.00f);

		e[1]=new Employee();
		e[1].setEmployeeId(321);
		e[1].setEmployeeName("Kumar");
		e[1].setEmpployeeSalary(25000.00f);
		// add employee array to department

		// display employees
		for (Employee emp : e) {
			System.out.println("Employee Id:" + emp.getEmployeeId());
			System.out.println("Employee Name:" + emp.getEmployeeName());
			System.out.println("Salary in Rs." + emp.getEmpployeeSalary());
		}

		// employees array e belongs to department Sales
		dept[0].setEmployee(e);

		// 2nd Array of employees
		Employee e2[] = new Employee[3];
		
		e2[0]=new Employee();
		e2[0].setEmployeeId(111);
		e2[0].setEmployeeName("Rasheed");
		e2[0].setEmpployeeSalary(54000.00f);

		// 2nd Array of employees belongs to Department Operations
		dept[1].setEmployee(e2);

		// no employee in production department

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Employee Id:(0 for unknown)");
		int employeeId = Integer.parseInt(br.readLine());
		if (employeeId == 0) {
			System.out.println("Enter Department (S or O or P)");
			char departmentId = br.readLine().charAt(0);

			switch (departmentId) {
			case 'S':
				System.out.println("Sales");
				break;
			case 'O':
				System.out.println("Operations");
				break;
			case 'P':
				System.out.println("Production");
				break;
			default:
				System.out.println("No such department!");
			}

			System.out.println("Enter employee name:");
			String ename = br.readLine();
			boolean flag = false;
			// searching in 1st array of employees
			for (Employee emp : e) {
				if (emp.getEmployeeName().equals(ename)) {
					System.out.println(" belongs to Sales department");
					System.out.println("Welcome");
					flag = true;
				}
			}
			if (!flag) {
				for (Employee em : e2) {
					if (em.getEmployeeName().equals(ename)) {
						System.out.println(" belongs to Operations department");
						flag = true;
						System.out.println("Welcome");
					}
				}
			}
			if (!flag) {
				System.out.println("Employee does not belong to any department!");
			}

		}

	}

}

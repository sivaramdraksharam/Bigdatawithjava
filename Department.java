package com.satyam.day30.secure;

import com.satyam.day29.inheritance.Employee;

public class Department {

		private int departmentId;
		private String departmentName;
		private Employee employee[];

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public Employee[] getEmployee() {
			return employee;
		}

		public void setEmployee(Employee[] employee) {
			this.employee = employee;
		}

	}


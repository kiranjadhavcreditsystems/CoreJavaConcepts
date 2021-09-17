package com.csi.accessmodifiers;

class Employee {
	protected int empId = 121;

	String empName = "BINU";
}

public class EmployeeDetails {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println("\n Employee Id: " + e1.empId + "\n Employee Name: " + e1.empName);
	}
}

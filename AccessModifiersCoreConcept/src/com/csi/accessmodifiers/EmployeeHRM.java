package com.csi.accessmodifiers;

public class EmployeeHRM {
	
	protected String productName="MI SMART TV";
	public static void main(String[] args) {
		Employee e1 = new Employee();

		System.out.println("\n Employee Id: " + e1.empId + "\n Employee Name: " + e1.empName);
	}
}

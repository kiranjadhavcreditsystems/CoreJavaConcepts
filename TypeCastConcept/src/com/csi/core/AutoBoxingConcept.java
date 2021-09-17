package com.csi.core;

public class AutoBoxingConcept {
	public static void main(String[] args) {

		// Autoboxing

		int empId = 121;

		Integer employeeId = empId;

		System.out.println("\n Employee Id: " + employeeId);
		
		double productPrice=6789.92;
		
		Double prodPrice=productPrice;
		
		System.out.println("\n Product Price: "+ prodPrice);
	}
}

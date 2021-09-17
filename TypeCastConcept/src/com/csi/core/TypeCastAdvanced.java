package com.csi.core;

public class TypeCastAdvanced {
	public static void main(String[] args) {
		// NumberFormatException

		/*int empCode = 12345;

		String employeeCode = String.valueOf(empCode);

		System.out.println("\n Employee Code: " + employeeCode);*/
		
		String productCode="55";
		
		int prodCode = Integer.parseInt(productCode);
		
		System.out.println("\n Product Code: "+ prodCode);
	}
}







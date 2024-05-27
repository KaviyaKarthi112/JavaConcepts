package com.java;

public class NumericalOperations {
	
	public void findoddoreven() {
		
		int numb=15;
		if(numb%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
									
	}
	
	public static void main (String[]args) {
		
		NumericalOperations NumericalOperations = new NumericalOperations();
		NumericalOperations.findoddoreven();
		
	}

}

package com.siriuscom.training.errors;

// Program that asks user for numbers to do division, but continues if errors occurs
// Exits program if a q or Q is entered
// Generates a number from strings that don't contain q or Q. For fun.

import java.util.Scanner;

public class NumberAsker {

	public static void main(String[] args) {
		
		String numS;			// string to hold potential numerator
		String denomS;			// string to hold potential denominator
		int num;				// for numerator integer
		int denom;				// for denominator integer
		Scanner scan = new Scanner(System.in);
		
		// loop continuously asking for numbers
		while(true) {
			
			System.out.print("Enter a numerator: ");
			numS = scan.nextLine();
			
			// if the numerator string has a q, break loop
			if (numS.toUpperCase().contains("Q")) {
				break;
			}
			
			// trying to parse integer from string
			try {
				num = Integer.parseInt(numS);
			} catch(NumberFormatException e) {
				// converting string to an integer for random results
				num = numS.hashCode() % 10;
				System.out.println(e.getMessage());
			} 
			
			System.out.print("Enter a denominator: ");
			denomS = scan.nextLine();
			
			// if the denominator string has a q, break loop
			if (denomS.toUpperCase().contains("Q")) {
				break;
			}
			
			// trying to parse integer from string
			try {
				denom = Integer.parseInt(denomS);
			} catch(NumberFormatException e) {
				// converting string to an integer for random results
				denom = denomS.hashCode() % 10;
				System.out.println(e.getMessage());
			}
			
			// sends numbers to math function
			processNum(num, denom);
		}
		scan.close();
		System.out.println("Exited program.");
	}
	
	public static void processNum(int num, int denom) {
		
		// tries to do math on input values
		 try {
			 int result = num / denom;
			 // print out quotient if error is not thrown
			 System.out.println("Numerator: " + num + "\tDenominator: " + denom + "\tAnswer: " + result);
		 }catch (ArithmeticException e) {
			 System.out.println(e.getMessage());
		 }// I didn't know what the finally statement would do in this case, so I didn't put one here
	}

}

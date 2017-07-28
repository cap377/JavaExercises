package com.siriuscom.training.errors;

// Program that asks user for numbers to do division, but continues if errors occurs
// Exits program if a q or Q is entered
// Generates a number from strings that don't contain q or Q. For fun.

import java.util.Scanner;

public class NumberAsker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "[0-9]+";
		String numS;
		String denomS;
		int num;
		int denom;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a numerator: ");
			numS = scan.nextLine();
			if (numS.toUpperCase().contains("Q")) {
				break;
			}
			try {
				num = Integer.parseInt(numS);
			} catch(Exception e) {
				// converting string to an integer for random results
				num = numS.hashCode() % 10;
				System.out.println(e.getMessage());
			} 
			System.out.print("Enter a denominator: ");
			denomS = scan.nextLine();
			if (denomS.toUpperCase().contains("Q")) {
				break;
			}
			try {
				denom = Integer.parseInt(denomS);
			} catch(Exception e) {
				// converting string to an integer for random results
				denom = denomS.hashCode() % 10;
				System.out.println(e.getMessage());
			}
			processNum(num, denom);
		}
		System.out.println("Exited program.");
	}
	
	public static void processNum(int num, int denom) {
		 try {
			 int result = num / denom;
			 System.out.println("Numerator: " + num + "\tDenominator: " + denom + "\tAnswer: " + result);
		 }catch (ArithmeticException e) {
			 System.out.println(e.getMessage());
		 }
	}

}

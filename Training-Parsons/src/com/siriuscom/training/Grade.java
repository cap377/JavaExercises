package com.siriuscom.training;

// takes in a double point object and prints out the appropriate grade

public class Grade {

	public static void main(String[] args) {
		
		double points = 64.0;
		
		if (points < 0 || points > 120) {
			System.out.println("You cannot have negative points");
		}
		else if (points <= 49.5) {
			System.out.println("5.0");
		}
		else if (points <= 59.5) {
			System.out.println("4.7");
		}
		else if (points <= 64.5) {
			System.out.println("4.0");
		}
		else if (points <= 69.5) {
			System.out.println("3.7");
		}
		else if (points <= 74.5) {
			System.out.println("3.3");
		}
		else if (points <= 79.5) {
			System.out.println("3.0");
		}
		else if (points <= 84.5) {
			System.out.println("2.7");
		}
		else if (points <= 89.5) {
			System.out.println("2.3");
		}
		else if (points <= 94.5) {
			System.out.println("2.0");
		}
		else if (points <= 99.5) {
			System.out.println("1.7");
		}
		else if (points <= 104.5) {
			System.out.println("1.3");
		}
		else if (points <= 120.0) {
			System.out.println("1.0");
		}
	}

}

package com.siriuscom.training.errors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageMarkCalculator {

	public static void main(String[] args) {
		
		String numbersString;		// string to store scanned in line of integers
		String[] individualNumbers;	// string to hold parsed number strings
		ArrayList<Integer> numberArray = new ArrayList<Integer>();	// array list to hold parsed integers
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Please enter 10 integer values to average: ");
			numbersString = scan.nextLine();
			if (numbersString.equals("exit")) {
				System.out.println("Exiting program...");
				break;
			}
			// removing leading whitespace and replaces multiple spaces with 1
			numbersString = numbersString.trim().replaceAll("( )+", " ");
			System.out.println(numbersString);
			// splitting at spaces between numbers
			individualNumbers = numbersString.split(" ");
			for (String number : individualNumbers) {
				try {
					// checks if integer
					numberArray.add(Integer.parseInt(number));
				} catch (NumberFormatException e) {
					// if it isn't an integer, it replaces the letter or word with a 0
					System.out.println(e.getMessage());
					numberArray.add(0);
				}
			}
			System.out.println(average(numberArray));
		}
		scan.close();
	}
	public static int average(List<Integer> numbers) {
		int total = 0;
		int average = 0;
		for (int num : numbers) {
			try {
				// checks if number passed triggers one of two custom exceptions
				if (num < 0) {
					throw new NegativeNumberException();
				}
				else if (num > 100) {
					throw new NumberOutOfBoundsException();
				}
			} catch (NegativeNumberException e) {
				// if its negative, sets it to 0
				System.out.println(e.getMessage(num));
				num = 0;
			} catch (NumberOutOfBoundsException er) {
				// if its over 100, sets it to 100
				System.out.println(er.getMessage(num));
				num = 100;
			} finally {
				// adds number to total
				total += num;
			}
			
		}
		// calculates and returns average
		average = total / numbers.size();
		return average;
	}
}

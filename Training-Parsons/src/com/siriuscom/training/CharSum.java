package com.siriuscom.training;

// prints out the sum of the numbers in a character array

public class CharSum {

	public static void main(String[] args) {
		char[] numbers = {'1', '5', '9', '3'};
		long sum = 0;
		for (char element : numbers) {
			switch(element) {
			case '0':
				break;
			case '1':
				sum++;
				break;
			case '2':
				sum += 2;
				break;
			case '3':
				sum += 3;
				break;
			case '4':
				sum += 4;
				break;
			case '5':
				sum += 5;
				break;
			case '6':
				sum += 6;
				break;
			case '7':
				sum += 7;
				break;
			case '8':
				sum += 8;
				break;
			case '9':
				sum += 9;
				break;
			}
		}
		System.out.println(sum);
	}

}

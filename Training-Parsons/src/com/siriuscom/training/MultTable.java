package com.siriuscom.training;

// prints out a multiplication table up to 10

public class MultTable {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}

	}

}

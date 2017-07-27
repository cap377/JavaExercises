package com.siriuscom.training;

// Driver that simulates Captain managing pirates over the course of 100 days. Prints out what day it is and 
// how much food they have at the end of the day from Captian class.

public class PirateDriver {

	public static void main(String[] args) {
		
		int daysMarooned = 100;
		
		Captain jack = new Captain();
		for (int i = 1; i <= daysMarooned; i++) {
			jack.assignPirates();
			jack.collect();
			jack.feedPirates();
			jack.checkFood();
			jack.passDay();
		}
	}
}

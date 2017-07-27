package com.siriuscom.training;

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

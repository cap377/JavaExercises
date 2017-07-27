package com.siriuscom.training;

// Captain object, that assigns pirates based on the date whether they will collect fruit or fish and how many of each.
// He also collects the food from his pirates and feeds them at the end of the day.

import java.util.Random;

public class Captain {
	
	private int day;
	private Pirate[] pirates;
	private int num;
	private int food;
	
	public Captain() {
		pirates = new Pirate[35];
		for (int i = 0; i < 35; i++) {
			pirates[i] = new Pirate();
		}
		day = 1;
	}
	public void assignPirates() {
		System.out.println("It is day " + this.day + ".");
		if (isPrime(this.day)) {
			this.num = this.day;
		}
		else if (this.day % 2 == 0) {
			this.num = this.day/2;
		}
		else {
			this.num = (this.day+1)/2;
		}
		if (this.num > 35) {
			this.num = 35;
		}
		System.out.println(num + " pirates have been selected to collect fruit.");
		int i = 0;
		Random rand = new Random();
		for (i = 0; i < num; i++) {
			int quantity = rand.nextInt((10 - 1)+1)+1;
			pirates[i].setTask("fruit", quantity);
			//pirates[i].getTask();
		}
		for (int j = i; j < 35; j++) {
			int quantity = rand.nextInt(5);
			pirates[j].setTask("fish", quantity);
			//pirates[j].getTask();
		}
	}
	public boolean isPrime(int n) {
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public void collect() {
		for (int k = 0; k < 35; k++) {
			food += pirates[k].collect();
		}
	}
	public void checkFood() {
		System.out.println("Food left: " + this.food);
	}
	public void feedPirates() {
		double feed = this.food / 36;
		Double fee = feed;
		int f = fee.intValue();
		System.out.println("Pirates are fed: " + f + " food each.");
		for (int p = 0; p < 36; p++) {
			this.food -= f;
		}
	}
	public void passDay() {
		this.day++;
	}
}

package com.siriuscom.training;

import java.util.ArrayList;
import java.util.Random;

public class RandomArgs<T> {
	
	public RandomArgs() {}
	
	public void printRand(T[] args) {
		ArrayList<Integer> passed = new ArrayList<Integer>();
		int checked = 0;
		Random rand = new Random();
		while (checked < args.length-1) {
			int randomNum = rand.nextInt(args.length);
			if (!passed.contains(randomNum)) {
				System.out.println(args[randomNum].toString());
				passed.add(randomNum);
			}
		}
	}
}
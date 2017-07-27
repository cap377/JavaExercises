package com.siriuscom.training.practice3;

import java.util.ArrayList;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Cherie Alyse Parsons";
		String[] parts = name.split(" ");
		StringBuilder initials = new StringBuilder();
		for (int i = 0; i < parts.length; i++) {
			initials.append(parts[i].charAt(0));
		}
		System.out.println("Name: " + name + "\tInitials: " + initials);
	}

}

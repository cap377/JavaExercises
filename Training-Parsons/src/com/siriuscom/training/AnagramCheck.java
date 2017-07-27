package com.siriuscom.training;

public class AnagramCheck {

	public static void main(String[] args) {
		String first = "numob";
		String second = "bumn";
		boolean status = true;
		
		// removing spaces
		first = first.replaceAll("\\s", "");
		second = second.replaceAll("\\s", "");
		
		for (int i = 0; i < first.length(); i++) {
			for (int j = 0; j < second.length(); j++) {
				if (first.charAt(i) == second.charAt(j)) {
					// the letter exists, now delete the character from that string
					second = second.replaceFirst(Character.toString(second.charAt(j)), "");
					System.out.println(second);
					break;
				}
			}
		}
		if (second.length() != 0) {
			status = false;
		}
		System.out.println(status);
	}
}

package com.siriuscom.training.practice3;

// Anagram checking function, prints out whether an the two words are anagrams of one another.

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "cherie";
		String word2 = "hi Erec";
		
		word1 = word1.replace(" ", "");
		word2 = word2.replace(" ",  "");
		
		word1 = word1.toUpperCase();
		word2 = word2.toUpperCase();
		

		if (word1.length() != word2.length()) {
			System.out.println("The two words are not anagrams.");
		}
		else {
			for (int k = 0; k < word1.length(); k++) {
				word2 = word2.toString().replaceFirst(word1.charAt(k)+"", "");
			}
			if(word2.length() > 0) {
				System.out.println("The two words are not anagrams.");
			}
			else {
				System.out.println("The two words are anagrams.");
			}
		}
	}

}

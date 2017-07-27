package practice3;

// Anagram checking function, prints out whether an the two words are anagrams of one another.

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "cherie";
		String word2 = "hi Erec";
		
		StringBuilder nword1 = new StringBuilder();
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) != ' ') {
				nword1.append(Character.toString(word1.charAt(i)));
			}
		}
		
		StringBuilder nword2 = new StringBuilder();
		for (int j = 0; j < word2.length(); j++) {
			if (word2.charAt(j) != ' ') {
				nword2.append(Character.toString(word2.charAt(j)));
			}
		}

		if (nword1.length() != nword2.length()) {
			System.out.println("The two words are not anagrams.");
		}
		else {
			for (int k = 0; k < nword1.length(); k++) {
				for (int m = 0; m < nword2.length(); m++) {
					if(Character.toString(nword1.charAt(k)).toUpperCase().equals(Character.toString(nword2.charAt(m)).toUpperCase())) {
						nword2.deleteCharAt(m);
					}
				}
			}
			if(nword2.length() > 0) {
				System.out.println("The two words are not anagrams.");
			}
			else {
				System.out.println("The two words are anagrams.");
			}
		}
	}

}

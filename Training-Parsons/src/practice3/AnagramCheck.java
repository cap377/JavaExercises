package practice3;

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
		
		StringBuilder nword1 = new StringBuilder();
		StringBuilder nword2 = new StringBuilder();
		
		nword1.append(word1);
		nword2.append(word2);

		if (nword1.length() != nword2.length()) {
			System.out.println("The two words are not anagrams.");
		}
		else {
			for (int k = 0; k < nword1.length(); k++) {
				for (int m = 0; m < nword2.length(); m++) {
					if(nword1.charAt(k) == nword2.charAt(m)) {
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

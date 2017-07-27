package com.siriuscom.training;

// Takes in a string, extracts the names, makes their initials, and returns if the initials are a 
// palindrome, monotonous, and if they have a twin in the array with the same initials.

public class PeopleNature {

	public static void main(String[] args) {
		String sentence = "\"Cherie Parsons\" asd etwer grerg"
				+ " \"Chels peirce\" asde et yu kjlj zi kj"
				+ " \"A Girl\" hates almonds"
				+ " \"JohN ash jacobs\" lkjoie loivj"
				+ "\"justin JoE\" asdf lkjoine iuoiwe";
		
		// SPLITS SENTENCE AT QUOTES
		String[] splits = sentence.split("\"");
		int nameCount = 0;
		// FINDS HOW MANY NAMES ARE IN SENTENCE
		for (int i = 0; i < splits.length; i++) {
			if (i % 2 == 1) {
				nameCount++;
			}
		}
		// INITIALIZES ARRAY FOR INITIALS
		String[] initials = new String[nameCount];
		int ic = 0;
		// INITIALIZES ARRAY FOR NAMES
		String[] names = new String[nameCount];
		int n = 0;
		Boolean[] twins = new Boolean[nameCount];
		for (int t = 0; t < nameCount; t++) {
			twins[t] = false;
			initials[t] = "";
		}
		// LOOPS THROUGH NAMES
		for (int i = 0; i < splits.length; i++) {
			if (i % 2 == 1) {
				// ADDS FULL NAMES TO NAMES ARRAY
				names[n] = splits[i];
				// SPLITS AGAIN TO GET PARTS OF NAME
				String[] inits = names[n++].split(" ");
				StringBuilder sb = new StringBuilder();
				for (String name : inits) {
					// MAKES A STRING OF INITIALS OF PARTS OF NAME
					sb.append(Character.toString((name.charAt(0))).toUpperCase());
				}
				// ADDS INITIALS TO INITIALS ARRAY
				initials[ic++] = sb.toString();
			}
		}
		checkPalMon(initials, names, twins);
	}
	
	public static void checkPalMon(String[] initials, String[] names, Boolean[] twins) {
		for(int i = 0; i < initials.length; i++) {
			boolean pal = false;
			boolean mon = false;
			checkForTwins(initials, i, twins);
			int place = 0;
			for (int j = 1; j < initials[i].length(); j++) {
				if (initials[i].charAt(place) == initials[i].charAt(j++)) {
					mon = true;
				}
				else {
					mon = false;
				}
			}
			StringBuilder rev = new StringBuilder();
			rev.append(initials[i]);
			if (initials[i].equals(rev.reverse().toString())) {
				pal = true;
			}
			if (!mon && !pal) {
				System.out.print(initials[i] + ". " + names[i] + " is No One");
			}
			else if (mon) {
				System.out.print(initials[i] + ". " + names[i] + " is Monotonous");
			}
			else {
				System.out.print(initials[i] + ". " + names[i] + " is Palindromous");
			}
			if (twins[i] == true) {
				System.out.println(" and has a twin.");
			}
			else {
				System.out.println(".");
			}
		}
	}
	public static void checkForTwins(String[] initials, int cur, Boolean[] twins) {
		for (int i = 0; i < initials.length; i++) {
			if (i != cur) {
				if(initials[i].equals(initials[cur])) {
					twins[i] = true;
					twins[cur] = true;
				}
			}
		}
	}
}

package Phones;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		PhoneGenerator gen = new PhoneGenerator();
		gen.generate();
		ArrayList<Phone> phones = gen.getPhones();
		int phoneCount = 0;
		
		for (Phone phone : phones) {
			phone.qualityCheck();
		}
	}

}

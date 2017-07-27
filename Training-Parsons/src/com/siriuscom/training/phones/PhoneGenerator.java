package com.siriuscom.training.phones;

import java.util.ArrayList;

public class PhoneGenerator {
	
	private ArrayList<Phone> phones;
	int phoneCount;
	
	public PhoneGenerator() {
		this.phones = new ArrayList<Phone>();
		this.phoneCount = 0;
	}
	
	public void generate() {
		
		// Sony
		phones.add(new Sony("Grey", 12, 800, 1200));
		phones.add(new Sony("Red", 16, 1000, 1600));
		phones.add(new Sony("Black", 6, 800, 1200));
		phones.add(new Sony("Blue", 8, 360, 800));
		phones.add(new Sony("Grey", 8, 800, 1200));
		// Samsung
		phones.add(new Samsung("Grey", 12, 400, 900));
		phones.add(new Samsung("Red", 16, 800, 1200));
		phones.add(new Samsung("Black", 12, 800, 1200));
		phones.add(new Samsung("Blue", 10, 360, 800));
		phones.add(new Samsung("Grey", 18, 600, 1200));
				
	}
	
	public ArrayList<Phone> getPhones() {
		return this.phones;
	}
}

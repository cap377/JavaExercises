package com.siriuscom.training.employee;

import java.util.Date;

public class Employee {
	
	String name;
	Date dateOfJoining;
	
	public Employee(String name) {
		this.dateOfJoining = new Date();
		this.name = name;
	}
}

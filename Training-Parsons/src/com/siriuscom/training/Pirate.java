package com.siriuscom.training;

// Pirate object that holds a task for what food and how many they should collect.

public class Pirate {
	
	private String task;
	private int amount;
	
	public Pirate() {
		this.amount = 0;
	}
	public void setTask(String task, int amount) {
		this.task = task;
		this.amount = amount;
	}
	public int collect() {
		return amount;
	}
	public void getTask() {
		System.out.println("Task: " + task + "\tAmount: " + amount);
	}
}

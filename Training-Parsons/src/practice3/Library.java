package practice3;

//generic library that can hold any media object

import java.util.ArrayList;

public class Library <T>{
	
	private ArrayList<T> inventory;
	
	public Library() {
		this.inventory = new ArrayList<T>();
	}
	
	public <T extends Media> addInventory(<T> obj){
		inventory.add(obj);
	}
	public <T extends Media> removeInventory(<T> obj){
		inventory.remove(obj);
	}
	public printInventory() {
		for (T item : inventory) {
			item.toString();
		}
	}
}

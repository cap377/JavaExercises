package generics;

import java.util.ArrayList;

public class Library <T>{
	
	ArrayList<T> inventory = new ArrayList<T>();
	
	public <T extends Media> Library() {
		
	}
	
	
}

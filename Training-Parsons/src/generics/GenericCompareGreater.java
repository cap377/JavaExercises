package generics;

// Takes in a generic object and checks if its greater than a specified passed int value

import java.util.ArrayList;

public class GenericCompareGreater<T> {
	
	private int greater;
	
	public GenericCompareGreater() {
		this.greater = 0;
	}
	
	public <T extends Number> int compare(ArrayList<T> array, int value) {
		for (T obj : array) {
			if (obj.intValue() > value) {
				greater++;
			}
		}
		return greater;
	}
}
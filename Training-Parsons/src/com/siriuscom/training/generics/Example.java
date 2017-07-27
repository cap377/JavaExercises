package com.siriuscom.training.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example <T>{
	public int countElements(Collection<T> items) {
		int count = 0;
		for (T item : items) {
			count++;
		}
		return count;
	}
	// <T extends Object & Interface>
	public <T extends Number> int countElementsIfDivBy(Collection<T> items, int value) {
		int count = 0;
		for (T item: items) {
			if (item.intValue() % value == 0) {
				count++;
			}
		}
		return count;
	}
	public void main(String[] args) {
		Example<Integer> test = new Example<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		test.countElements(list);
		test.countElementsIfDivBy(list, 3);
	}
}

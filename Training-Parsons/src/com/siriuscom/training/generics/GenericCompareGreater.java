package com.siriuscom.training.generics;

import java.util.List;

public class GenericCompareGreater<T> {
	
	private int greater;
	
	public GenericCompareGreater() {
		this.greater = 0;
	}
	
	public <T extends Number> int compare(List<T> array, int value) {
		for (T obj : array) {
			if (obj.intValue() > value) {
				greater++;
			}
		}
		return greater;
	}
}
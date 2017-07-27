package com.siriuscom.training.generics;

import java.util.Collection;
import java.util.Map;

public class GenericCompare<T> {
	
	public <T extends Map> GenericCompare(Collection<T> collection, String property) {
		howMany(collection, property);
	}
	
	public <T extends Map> int howMany(Collection<T> collection, String property) {
		int num = 0;
		for (T item : collection) {
			if (item.containsKey(property)) {
				num++;
			}
		}
		return num;
	}
}

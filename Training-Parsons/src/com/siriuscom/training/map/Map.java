package com.siriuscom.training.map;

// custom built map class

public class Map<K, V> {
	
	Object[] keys;
	Object[] values;
	
	public Map() {
		keys = new Object[10000];
		values = new Object[10000];
	}
	
	public String toString(K key) {
		if (keys[(key.hashCode()%10000)] == null) {
			return "";
		}
		return ("Key: " + keys[(key.hashCode()%10000)] + "\tValue: " + values[(key.hashCode()%10000)]);
	}
	public void put(K key, V value) {
		keys[key.hashCode()%10000] = key;
		values[key.hashCode()%10000] = value;
	}
	public void remove(K key) {
		keys[key.hashCode()%10000] = null;
		values[key.hashCode()%10000] = null;
	}
	public Object get(K key) {
		return values[key.hashCode()%10000];
	}
}

package practice3;

// Personal implementation of hash table

public class HashTable<K, V> {
	
	Object keys[];
	Object values[];
	int size;
	
	public HashTable() {
		keys = new Object[10000];
		values = new Object[10000];
		size = 0;
	}
	
	public Object get(K key) {
		if(keys[(key.hashCode()%10000)] == null) {
			return null;
		}
		else {
			return values[(key.hashCode()%10000)];
		}
	}
	public void put(K key, V value) {
		if (value == null || key == null) {
			System.out.println("Cannot add null values to table");
		}
		else {
			keys[(key.hashCode()%10000)] = key;
			values[(key.hashCode()%10000)] = value;
			size++;
		}
	}
	public void remove(K key) {
		keys[(key.hashCode()%10000)] = null;
		values[(key.hashCode()%10000)] = null;
		size--;

	}
	public Boolean containsKey(K key) {
		if(keys[(key.hashCode()%10000)] != null) {
			return true;
		}
		return false;
	}
	public int size() {
		return size;
	}
}

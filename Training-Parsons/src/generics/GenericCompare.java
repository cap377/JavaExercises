package generics;

// Goes through a generic collection and checks how many entries contain a certain property

import java.util.Collection;
import java.util.Map;

public class GenericCompare<T> {
	
	public <T extends Map> GenericCompare(Collection<T> collection, <T> property) {
		howMany(collection, property);
	}
	
	public <T extends Map> int howMany(Collection<T> collection, <T> property) {
		int num = 0;
		for (T item : collection) {
			if (item.containsKey(property)) {
				num++;
			}
		}
		return num;
	}
}

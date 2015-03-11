package cow.farm.utils;

import cow.farm.utils.LukaszGenericArrayList;

import java.util.HashMap;
import java.util.Map;

public class QuantityCheckingList<T> extends LukaszGenericArrayList<T> {

	public HashMap<T, Integer> getQuantityOfEachObject() {
		HashMap<T, Integer> hashMap = new HashMap<>();
		int value = 0;
		for (T key : hashMap.keySet()) {
			if (!hashMap.containsKey(key)) {
				hashMap.put(key, 1);
			}
			value = hashMap.get(key);
			value++;
			hashMap.put(key, value);
		}
		return hashMap;
	}

}

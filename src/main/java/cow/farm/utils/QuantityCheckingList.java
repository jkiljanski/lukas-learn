package cow.farm.utils;

import cow.farm.utils.LukaszGenericArrayList;

import java.util.HashMap;
import java.util.Map;

public class QuantityCheckingList<E> extends LukaszGenericArrayList<E> {

	public HashMap<E, Integer> getQuantityOfEachObject() {
		HashMap<E, Integer> hashMap = new HashMap<>();
		int value = 0;
		for (E key : array) {
			if (!hashMap.containsKey(key)) {
				hashMap.put(key, 1);
			} else {
				value = hashMap.get(key);
				value++;
				hashMap.put(key, value);
			}
		}
		return hashMap;
	}

}

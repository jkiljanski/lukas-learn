package cow.farm.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractQuantityCheckingList<D, A> extends ArrayList<D> {

	public Map<A, Integer> getQuantityOfEachAttribute() {
		Map<A, Integer> hashMap = new HashMap<>();
		int value = 0;
		for (D element : this) {
			A attribute = getAttributeFromObject(element);
			if (!hashMap.containsKey(attribute)) {
				hashMap.put(attribute, 1);
			} else {
				value = hashMap.get(attribute);
				value++;
				hashMap.put(attribute, value);
			}
		}
		return hashMap;
	}

	protected abstract A getAttributeFromObject(D element);

}
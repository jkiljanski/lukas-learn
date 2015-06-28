package cow.farm.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuantityCheckingList<D> extends ArrayList<D> {

	public <A> Map<A, Integer> getQuantityOfEachAttribute(DomainToAttributeTransformation<D, A> transformation) {
		Map<A, Integer> hashMap = new HashMap<>();
		int value = 0;
		for (D element : this) {
			A attribute = transformation.getAttributeFromDomain(element);
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


}
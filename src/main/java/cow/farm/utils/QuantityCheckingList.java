package cow.farm.utils;

import cow.farm.utils.LukaszGenericArrayList;

import java.util.HashMap;
import java.util.Map;

public class QuantityCheckingList<T> extends LukaszGenericArrayList<T> {

	public QuantityCheckingList() {
	}

	public HashMap<T , Integer> getQuantityOfEachObject(){
		HashMap<T, Integer> hashMap = new HashMap<>();
		int index=0;
		for (T key:this){
			if (!hashMap.containsValue(key)){
				hashMap.put(key,1);
			}
			index = hashMap.get(key);
			index++;
			hashMap.put(key,index);
		}
		return hashMap;
	}

}

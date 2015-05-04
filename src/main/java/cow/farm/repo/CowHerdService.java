package cow.farm.repo;


import cow.farm.utils.QuantityCheckingList;

import java.util.HashMap;
import java.util.Map;

public class CowHerdService {

	QuantityCheckingList<Cow> cowList = new QuantityCheckingList<>();

	public Cow makeCow(Cow.Breed breed) {
		Cow cow = new Cow(breed);
		cowList.add(cow);
		return cow;
	}

	public Map<Cow, Integer> getHerdMap() {
		Map<Cow, Integer> cowBreadMap = new HashMap<Cow, Integer>();
		cowBreadMap = cowList.getQuantityOfEachObject();
		return cowBreadMap;
	}
}

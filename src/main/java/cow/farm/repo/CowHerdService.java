package cow.farm.repo;


import cow.farm.utils.QuantityCheckingList;

import java.util.HashMap;

public class CowHerdService {

	QuantityCheckingList<Cow> cowList = new QuantityCheckingList<>();

	public Cow makeCow(Cow.Breed breed) {
		Cow cow = new Cow(breed);
		cowList.add(cow);
		return cow;
	}

	public HashMap getHerdMap () {
		HashMap cowBreadMap = cowList.getQuantityOfEachObject();
		return cowBreadMap;
	}
}

package cow.farm.repo;


import cow.farm.utils.BreedAttributeMaker;

import java.util.Map;

public class CowHerdService {

	BreedAttributeMaker cowList = new BreedAttributeMaker();

	public Cow makeCow(Cow.Breed breed) {
		Cow cow = new Cow(breed);
		cowList.add(cow);
		return cow;
	}

	public Map<Cow.Breed, Integer> getHerdMap() {
		return cowList.getQuantityOfEachAttribute();
	}
}

package cow.farm.repo;


import cow.farm.utils.BreedAttributeMaker;

import java.util.Map;

public class CowHerdService {

	BreedAttributeMaker cowList = new BreedAttributeMaker();

	public Cow makeCow(String name, Cow.Breed breed, float weight, Cow.Color color) {
		Cow cow = new Cow(name, breed, weight, color);
		cowList.add(cow);
		return cow;
	}

	public Map<Cow.Breed, Integer> getHerdMap() {
		return cowList.getQuantityOfEachAttribute();
	}

	public void addCow(Cow cow) {
		cowList.add(cow);
	}
}

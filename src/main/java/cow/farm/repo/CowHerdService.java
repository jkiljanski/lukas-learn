package cow.farm.repo;


import cow.farm.utils.QuantityCheckingList;

import java.util.Map;

public class CowHerdService {

	QuantityCheckingList<Cow> cowList = new QuantityCheckingList<>();

	public Cow makeCow(String name, Cow.Breed breed, float weight, Cow.Color color) {
		Cow cow = new Cow(name, breed, weight, color);
		cowList.add(cow);
		return cow;
	}

	public Map<String, Integer> getHerdQuantityByName() {
		return cowList.getQuantityOfEachAttribute(new CowToNameTransformation());
	}

	public Map<Cow.Breed, Integer> getHerdQuantityByBreed() {
		return cowList.getQuantityOfEachAttribute(new CowToBreedTransformation());
	}

	public Map<Float, Integer> getHerdQuantityByWeight() {
		return cowList.getQuantityOfEachAttribute(new CowToWeightTransformation());
	}

	public Map<Cow.Color, Integer> getHerdQuantityByColor() {
		return cowList.getQuantityOfEachAttribute(new CowToColorTransformation());
	}

	public void addCow(Cow cow) {
		cowList.add(cow);
	}
}

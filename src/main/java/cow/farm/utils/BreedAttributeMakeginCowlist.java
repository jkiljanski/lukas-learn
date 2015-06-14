package cow.farm.utils;

import cow.farm.repo.Cow;

public class BreedAttributeMakeginCowlist extends AbstractQuantityCheckingList<Cow, Cow.Breed> {


	@Override
	protected Cow.Breed getAttributeFromObject(Cow element) {
		return element.getBreed();
	}
}

package cow.farm.repo;

import cow.farm.utils.DomainToAttributeTransformation;

public class CowToBreedTransformation implements DomainToAttributeTransformation<Cow, Cow.Breed> {


	@Override
	public Cow.Breed getAttributeFromDomain(Cow element) {
		return element.getBreed();
	}
}

package cow.farm.repo;

import cow.farm.utils.DomainToAttributeTransformation;

public class CowToWeightTransformation implements DomainToAttributeTransformation<Cow, Float> {


	@Override
	public Float getAttributeFromDomain(Cow element) {
		return element.getWeight();
	}
}

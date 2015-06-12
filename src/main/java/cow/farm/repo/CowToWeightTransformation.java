package cow.farm.repo;

import cow.farm.utils.DomainToAttributeTransformation;

public class CowToWeightTransformation implements DomainToAttributeTransformation<Cow, Integer> {


	@Override
	public Integer getAttributeFromDomain(Cow element) {
		return element.getWeight();
	}
}

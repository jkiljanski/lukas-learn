package cow.farm.repo;

import cow.farm.utils.DomainToAttributeTransformation;

public class CowToWeightTransformation implements DomainToAttributeTransformation<Cow, Short> {


	@Override
	public Short getAttributeFromDomain(Cow element) {
		return element.getWeight();
	}
}

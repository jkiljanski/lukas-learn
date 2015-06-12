package cow.farm.repo;

import cow.farm.utils.DomainToAttributeTransformation;

public class CowToNameTransformation implements DomainToAttributeTransformation<Cow, String> {


	@Override
	public String getAttributeFromDomain(Cow element) {
		return element.getName();
	}
}

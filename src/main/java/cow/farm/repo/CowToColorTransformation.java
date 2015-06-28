package cow.farm.repo;

import cow.farm.utils.DomainToAttributeTransformation;

public class CowToColorTransformation implements DomainToAttributeTransformation<Cow, Cow.Color> {


	@Override
	public Cow.Color getAttributeFromDomain(Cow element) {
		return element.getColor();
	}
}

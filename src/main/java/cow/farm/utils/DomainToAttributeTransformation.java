package cow.farm.utils;

public interface DomainToAttributeTransformation<D, A> {

	public A getAttributeFromDomain(D element);
}

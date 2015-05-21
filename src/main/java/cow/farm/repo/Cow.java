package cow.farm.repo;


public final class Cow {

	public enum Breed {ABONDANCE, ANGUS, RANDALL, REDPOOL}

	private final Breed breed;

	public Cow(final Breed breed) {
		this.breed = breed;
	}

	public Breed getBreed() {
		return breed;
	}
}

package cow.farm.repo;


public final class Cow {


	public enum Breed {ABONDANCE, ANGUS, RANDALL, REDPOOL}

	public enum Color {BLACK, BROWN, STRIPED}

	private String name;
	private final Breed breed;
	private short weight;
	private final Color color;

	public Cow(String name, final Breed breed, short weight, final Color color) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public Breed getBreed() {
		return breed;
	}

	public short getWeight() {
		return weight;
	}

	public Color getColor() {
		return color;
	}
}

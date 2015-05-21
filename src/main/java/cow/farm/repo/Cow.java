package cow.farm.repo;


public final class Cow {


	public enum Breed {ABONDANCE, ANGUS, RANDALL, REDPOOL}

	public enum Color {BLACK, BROWN, STRIPED}

	private String name;
	private final Breed breed;
	private float weight;
	private final Color color;

	public Cow(String name, final Breed breed, float weight, final Color color) {
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

	public float getWeight() {
		return weight;
	}

	public Color getColor() {
		return color;
	}
}

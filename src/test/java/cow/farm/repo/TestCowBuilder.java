package cow.farm.repo;

public class TestCowBuilder {
	public static final String NAME = "krasula";
	public static final Cow.Breed BREED = Cow.Breed.ABONDANCE;
	public static final int WEIGHT = 500;
	public static final Cow.Color COLOR = Cow.Color.BLACK;

	private String name = NAME;
	private Cow.Breed breed = BREED;
	private int weight = WEIGHT;
	private Cow.Color color = COLOR;

	public TestCowBuilder() {
	}

	public TestCowBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public TestCowBuilder withBreed(Cow.Breed breed) {
		this.breed = breed;
		return this;
	}

	public TestCowBuilder withWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public TestCowBuilder withColor(Cow.Color color) {
		this.color = color;
		return this;
	}


	public Cow build() {
		return new Cow(name, breed, weight, color);
	}


}

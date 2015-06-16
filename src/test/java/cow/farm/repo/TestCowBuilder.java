package cow.farm.repo;

public class TestCowBuilder {
	private String name;
	private Cow.Breed breed;
	private int weight;
	private Cow.Color color;

	public static final String NAME = "krasula";
	public static final Cow.Breed BREED = Cow.Breed.ABONDANCE;
	public static final int WEIGHT = 500;
	public static final Cow.Color COLOR = Cow.Color.BLACK;

	public TestCowBuilder() {
	}

	public TestCowBuilder withName(String name) {
		this.name = NAME;
		return this;
	}

	public TestCowBuilder withBreed(Cow.Breed breed) {
		this.breed = BREED;
		return this;
	}

	public TestCowBuilder withWeight(int weight) {
		this.weight = WEIGHT;
		return this;
	}

	public TestCowBuilder withColor(Cow.Color color) {
		this.color = COLOR;
		return this;
	}


	public Cow build() {
		return new Cow(name, breed, weight, color);
	}


}
